//2021115737 하재현
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

import java.util.Scanner;

public class Lab02 {
	static void q1() {
		Scanner input = new Scanner(System.in);

		while (true) {
			int num1 = 0, num2 = 0;

			System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
			System.out.print("혜미 >> ");
			String hye;
			hye = input.next();

			if (hye.equals("가위")) {
				num1 = 0;
			} else if (hye.equals("바위")) {
				num1 = 1;
			} else if (hye.equals("보")) {
				num1 = 2;
			} else if (hye.equals("Exit")) {
				break;
			}

			System.out.print("준범 >> ");
			String jun;
			jun = input.next();

			if (jun.equals("가위")) {
				num2 = 0;
			} else if (jun.equals("바위")) {
				num2 = 1;
			} else if (jun.equals("보")) {
				num2 = 2;
			} else if (jun.equals("Exit")) {
				break;
			}

			if ((num1 - num2 + 3) % 3 == 0) {
				System.out.println("무승부입니다.");
			} else if ((num1 - num2 + 3) % 3 == 1) {
				System.out.println("혜미가 이겼습니다.");
			} else if ((num1 - num2 + 3) % 3 == 2) {
				System.out.println("준범이가 이겼습니다.");
			}
		}
	}

	static void q2() {
		Scanner input = new Scanner(System.in);
		int large = 0, small = 100000000;

		while (true) {
			System.out.print("Enter integer : ");
			int num = input.nextInt();
			if (num == -1) {
				break;
			}
			if (num > large) {
				large = num;
			} else if (num < small) {
				small = num;
			}
		}
		System.out.printf("Smallest Integer is : %d\n", small);
		System.out.printf("Largest Integer is : %d\n", large);
	}

	static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("점 x를 입력하세요 : ");
		int x = input.nextInt();
		System.out.print("점 y를 입력하세요: ");
		int y = input.nextInt();

		if (((x >= 50) && (x <= 100)) && ((y >= 50) && (y <= 100))) {
			System.out.println("점(x,y)는 직사각형 안에 있습니다.");
		} else
			System.out.println("점(x,y)는 직사각형 안에 없습니다.");
	}

	static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("점 x1을 입력하세요 : ");
		int x1 = input.nextInt();
		System.out.print("점 y1을 입력하세요 : ");
		int y1 = input.nextInt();
		System.out.print("점 x2를 입력하세요 : ");
		int x2 = input.nextInt();
		System.out.print("점 y2를 입력하세요 : ");
		int y2 = input.nextInt();

		if (((x1 >= 50 && x1 <= 100) && (y1 >= 50 && y1 <= 100))
				|| ((x2 >= 50 && x2 <= 100) && (y2 >= 50 && y2 <= 100))) {
			System.out.println("직사각형이 서로 충돌합니다");
		} else {
			System.out.println("직사각형이 서로 충돌하지 않습니다.");
		}
	}

	public static void main(String[] args) {
		// q1();
		// q2();
		// q3();
		 q4();
	}

}
