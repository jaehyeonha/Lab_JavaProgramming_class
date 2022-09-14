//2021115737 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ� 
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
	private JLabel Money = new JLabel("�ݾ�");
	private JTextField MoneyInput = new JTextField(10);
	private JButton MoneyButton = new JButton("���");
	private JLabel Name = new JLabel("2021115737 ������");
	private Field[] fields = new Field[8];
	private String content[] = { "������", "����", "õ��", "500��", "100��", "50��", "10��", "1��" };
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