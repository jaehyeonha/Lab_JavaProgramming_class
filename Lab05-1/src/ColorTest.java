//2021115737 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.
enum Color {
	WHITE, BLACK, YELLOW, RED;
}

public class ColorTest {
	public static void main(String[] args) {
		for (Color color : Color.values())
			System.out.printf("%s\n", color);
	}
}