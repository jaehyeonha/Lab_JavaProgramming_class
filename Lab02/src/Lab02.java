//2021115737 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

import java.util.Scanner;

public class Lab02 {
	static void q1() {
		Scanner input = new Scanner(System.in);

		while (true) {
			int num1 = 0, num2 = 0;

			System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.");
			System.out.print("���� >> ");
			String hye;
			hye = input.next();

			if (hye.equals("����")) {
				num1 = 0;
			} else if (hye.equals("����")) {
				num1 = 1;
			} else if (hye.equals("��")) {
				num1 = 2;
			} else if (hye.equals("Exit")) {
				break;
			}

			System.out.print("�ع� >> ");
			String jun;
			jun = input.next();

			if (jun.equals("����")) {
				num2 = 0;
			} else if (jun.equals("����")) {
				num2 = 1;
			} else if (jun.equals("��")) {
				num2 = 2;
			} else if (jun.equals("Exit")) {
				break;
			}

			if ((num1 - num2 + 3) % 3 == 0) {
				System.out.println("���º��Դϴ�.");
			} else if ((num1 - num2 + 3) % 3 == 1) {
				System.out.println("���̰� �̰���ϴ�.");
			} else if ((num1 - num2 + 3) % 3 == 2) {
				System.out.println("�ع��̰� �̰���ϴ�.");
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
		System.out.print("�� x�� �Է��ϼ��� : ");
		int x = input.nextInt();
		System.out.print("�� y�� �Է��ϼ���: ");
		int y = input.nextInt();

		if (((x >= 50) && (x <= 100)) && ((y >= 50) && (y <= 100))) {
			System.out.println("��(x,y)�� ���簢�� �ȿ� �ֽ��ϴ�.");
		} else
			System.out.println("��(x,y)�� ���簢�� �ȿ� �����ϴ�.");
	}

	static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("�� x1�� �Է��ϼ��� : ");
		int x1 = input.nextInt();
		System.out.print("�� y1�� �Է��ϼ��� : ");
		int y1 = input.nextInt();
		System.out.print("�� x2�� �Է��ϼ��� : ");
		int x2 = input.nextInt();
		System.out.print("�� y2�� �Է��ϼ��� : ");
		int y2 = input.nextInt();

		if (((x1 >= 50 && x1 <= 100) && (y1 >= 50 && y1 <= 100))
				|| ((x2 >= 50 && x2 <= 100) && (y2 >= 50 && y2 <= 100))) {
			System.out.println("���簢���� ���� �浹�մϴ�");
		} else {
			System.out.println("���簢���� ���� �浹���� �ʽ��ϴ�.");
		}
	}

	public static void main(String[] args) {
		// q1();
		// q2();
		// q3();
		 q4();
	}

}
