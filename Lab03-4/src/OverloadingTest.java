// 2021115737 하재현
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class OverloadingTest{
	public static void main(String[] args)
	{
		System.out.printf("정수의 합: %d\n",sum(5,6));
		System.out.printf("실수의 합: %f\n",sum(5.1,6.2));
	}
	
	public static int sum(int num1, int num2)
	{
		System.out.printf("정수: %d, %d\n",num1,num2);
		return num1+num2;
	}
	public static double sum(double num1, double num2)
	{
		System.out.printf("실수: %f, %f\n",num1,num2);
		return num1+num2;
	}
}
