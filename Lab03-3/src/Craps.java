// 2021115737 ������
// ������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.
public class Craps {
	private enum Status {
		CONTINUE, WON, LOST
	};

	private enum Numbers {
		ZERO, ONE, TWO
	};

	public void play() {
		// syntax errors �������� Ÿ���� ��Ʈ�� ��ȯ�� �� ���� ��Ʈ�� �������� Ÿ������ ��ȯ�� �� ����.
		// int intNum1 = Status.CONTINUE;
		// int intNum2 = (int) Status.CONTINUE;
		// Status enmNum1 = 1;
		// Status enmNum2 = (Status) 1;

		// correct statements �������� Ÿ���� ��ȯ���� �ʾұ⿡ switch���� enumNum�� case�� Ÿ���� ����.
		Numbers enumNum = Numbers.ZERO;
		switch (enumNum) {
		case ZERO:
			break;
		case ONE:
			break;
		case TWO:
			break;
		}

		// correct statements switch���� intNum3�� case�� Ÿ���� ����.
		final int intConsNum = 0;
		int intNum3 = 0;
		switch (intNum3) {
		case intConsNum:
			break;
		}

		// syntax error switch���� intNum4�� case�� Ÿ���� ��Ʈ�� ���������� �ٸ���.
		// int intNum4 = 0;
		// switch (intNum4) {
		// case ZERO: //
		// break;
		// }
	}
}
