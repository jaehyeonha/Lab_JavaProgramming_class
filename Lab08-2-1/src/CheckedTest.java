//2021115737 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�
public class CheckedTest {
	public static void main(String[] args) {
		try {
			devideByZero(0);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}// Checked Exception�̹Ƿ� ���ܸ� ��Ÿ�� try-catch���� ����ؾ� ��

	public static void devideByZero(int num) throws Exception {
		if (num == 0) {
			throw new Exception("0���� ���� �� �����ϴ�.");
		} else {
			System.out.println(100 / num);
		}
	} // throws�� �̿��� ����ó��.
}