// 2021115737 하재현
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

import java.util.Scanner;
import java.lang.Math;

public class MathTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("x : ");
		double x = input.nextDouble();
		System.out.print("y : ");
		double y = input.nextDouble();

		System.out.printf("abs(x) : %f\n", Math.abs(x));
		System.out.printf("ceil(x) : %f\n", Math.ceil(x));
		System.out.printf("cos(x) : %f\n", Math.cos(x));
		System.out.printf("exp(x) : %f\n", Math.exp(x));
		System.out.printf("floor(x) : %f\n", Math.floor(x));
		System.out.printf("log(x) : %f\n", Math.log(x));
		System.out.printf("max(x,y) : %f\n", Math.max(x, y));
		System.out.printf("min(x,y) : %f\n", Math.min(x, y));
		System.out.printf("pow(x,y) : %f\n", Math.pow(x, y));
		System.out.printf("sin(x) : %f\n", Math.sin(x));
		System.out.printf("sqrt(x) : %f\n", Math.sqrt(x));
		System.out.printf("tan(x) : %f\n", Math.tan(x));
	}
}