//2021115737 하재현
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다
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
			System.out.println(car + "입니다.");
		} catch (Exception exception) {
			System.err.println(exception + "발생");
		}
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.car("bus");
		test.car("taxi");
	}

}