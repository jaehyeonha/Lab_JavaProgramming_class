//2021115737 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�

class UncheckedException extends RuntimeException {
}// RuntimeException�� ����Ͽ� UnCheckedExcpetion�� ��밡���ϰ� ��

public class UnCheckedTest {
	public static void main(String[] args) {
		devideByZero(0);
	}// UnCheckedException�̹Ƿ� ���ܸ� ��Ÿ�� try-catch���� ������� �ʾƵ� ��.
	
	public static void devideByZero(int num) {
		if (num == 0) {
			throw new UncheckedException();
		}
		System.out.println(100 / num);
	}	
}
