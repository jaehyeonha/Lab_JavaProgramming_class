// 2021115737 하재현
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.
public class Craps {
	private enum Status {
		CONTINUE, WON, LOST
	};

	private enum Numbers {
		ZERO, ONE, TWO
	};

	public void play() {
		// syntax errors 열거형의 타입을 인트로 변환할 수 없고 인트도 열거형의 타입으로 변환할 수 없다.
		// int intNum1 = Status.CONTINUE;
		// int intNum2 = (int) Status.CONTINUE;
		// Status enmNum1 = 1;
		// Status enmNum2 = (Status) 1;

		// correct statements 열거형의 타입을 변환하지 않았기에 switch문의 enumNum과 case의 타입이 같다.
		Numbers enumNum = Numbers.ZERO;
		switch (enumNum) {
		case ZERO:
			break;
		case ONE:
			break;
		case TWO:
			break;
		}

		// correct statements switch문의 intNum3과 case의 타입이 같다.
		final int intConsNum = 0;
		int intNum3 = 0;
		switch (intNum3) {
		case intConsNum:
			break;
		}

		// syntax error switch문의 intNum4와 case의 타입이 인트와 열거형으로 다르다.
		// int intNum4 = 0;
		// switch (intNum4) {
		// case ZERO: //
		// break;
		// }
	}
}
