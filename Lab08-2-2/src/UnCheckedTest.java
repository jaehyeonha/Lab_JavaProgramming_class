//2021115737 하재현
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다

class UncheckedException extends RuntimeException {
}// RuntimeException을 상속하여 UnCheckedExcpetion을 사용가능하게 함

public class UnCheckedTest {
	public static void main(String[] args) {
		devideByZero(0);
	}// UnCheckedException이므로 예외를 나타낸 try-catch문을 사용하지 않아도 됨.
	
	public static void devideByZero(int num) {
		if (num == 0) {
			throw new UncheckedException();
		}
		System.out.println(100 / num);
	}	
}
