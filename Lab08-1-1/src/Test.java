//2021115737 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�
class ExceptionA extends Exception {
}

class ExceptionB extends ExceptionA {
}

class ExceptionC extends ExceptionB {
}

public class Test {
	public void car(String car) {
		try {
			if ("bus".equals(car)) {
				// throw new Exception();
				// throw new ExceptionA();
				//throw new ExceptionB();
				throw new ExceptionC();
			}
			System.out.println(car + "�Դϴ�.");
		} catch (Exception exception) {
			System.err.println(exception + "�߻�");
		}
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.car("bus");
		test.car("taxi");
	}

}