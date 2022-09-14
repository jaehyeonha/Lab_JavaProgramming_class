//2021115737 하재현
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다
public class CheckedTest {
	public static void main(String[] args) {
		try {
			devideByZero(0);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}// Checked Exception이므로 예외를 나타낸 try-catch문을 사용해아 함

	public static void devideByZero(int num) throws Exception {
		if (num == 0) {
			throw new Exception("0으로 나눌 수 없습니다.");
		} else {
			System.out.println(100 / num);
		}
	} // throws를 이용한 예외처리.
}