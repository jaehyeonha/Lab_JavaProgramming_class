// 2021115737 ������
// ������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

public class Test {
	private static int num1;
	private int num2;

	public static void show1() {
		System.out.println(num1); // (1) O static method���� static ������ ����߱� ������ �����ϴ�.
		// System.out.println(num2); //(2) X static method���� non-static ������ ����߱� ������
		// �Ұ����ϴ�.
		show4(); // (3) O static method���� static method�� ȣ���߱� ������ �����ϴ�.
		// show5(); //(4) X static method���� non-static method�� ȣ���߱� ������ �Ұ����ϴ�.
	}

	public void show2() {
		System.out.println(num1); // (5) O non-static method���� static ������ ����� �����ϴ�.
		System.out.println(num2); // (6) O non-static method���� non-static ������ ����� �����ϴ�.
		show4(); // (7) O non-static method���� static method�� ȣ���� �����ϴ�.
		show5(); // (8) O non-static method���� non-static method�� ȣ���� �����ϴ�.
	}

	public static void show4() {

	}

	public void show5() {

	}
}
