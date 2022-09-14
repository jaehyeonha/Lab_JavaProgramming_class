// 2021115737 하재현
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class Test {
	private static int num1;
	private int num2;

	public static void show1() {
		System.out.println(num1); // (1) O static method에서 static 변수를 사용했기 때문에 가능하다.
		// System.out.println(num2); //(2) X static method에서 non-static 변수를 사용했기 때문에
		// 불가능하다.
		show4(); // (3) O static method에서 static method를 호출했기 때문에 가능하다.
		// show5(); //(4) X static method에서 non-static method를 호출했기 때문에 불가능하다.
	}

	public void show2() {
		System.out.println(num1); // (5) O non-static method에서 static 변수도 사용이 가능하다.
		System.out.println(num2); // (6) O non-static method에서 non-static 변수도 사용이 가능하다.
		show4(); // (7) O non-static method에서 static method도 호출이 가능하다.
		show5(); // (8) O non-static method에서 non-static method도 호출이 가능하다.
	}

	public static void show4() {

	}

	public void show5() {

	}
}
