//2021115737 하재현
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다 
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MoneyChanger extends JFrame {
	private JLabel Money = new JLabel("금액");
	private JTextField MoneyInput = new JTextField(10);
	private JButton MoneyButton = new JButton("계산");
	private JLabel Name = new JLabel("2021115737 하재현");
	private Field[] fields = new Field[8];
	private String content[] = { "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원" };
	private int unit[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

	public MoneyChanger() {
		super("Money Changer");
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.PINK);
		
		add(Money);
		add(MoneyInput);
		add(MoneyButton);


		for (int i = 0; i < fields.length; i++) {
			fields[i] = new Field(content[i]);
		}
		for (Field i : fields) {
			add(i);
		}
		add(Name);

		ClickHandler handler = new ClickHandler();
		MoneyButton.addActionListener(handler);
		MoneyInput.addActionListener(handler);
	}

	private class ClickHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String input;
			input = e.getActionCommand();
			int money = Integer.parseInt(input);
			int res;
			for (int i = 0; i < fields.length; i++) {
				res = money / unit[i];
				fields[i].output.setText(Integer.toString(res));
				if (res > 0) {
					money = money % unit[i];
				}
			}
		}
	}
}

class Field extends JPanel {
	private JLabel labelwon;
	public JTextField output = new JTextField(8);

	public Field(String won) {
		labelwon = new JLabel(won);
		add(labelwon);
		add(output);

		this.setBackground(Color.PINK);
	}
}