// 2021115737 하재현
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.
import java.security.SecureRandom;
import java.util.Scanner;

public class MultTest {
	private static final SecureRandom randomNumbers = new SecureRandom();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			int num1 = 1 + randomNumbers.nextInt(9);
			int num2 = 1 + randomNumbers.nextInt(9);
			int correct = 1 + randomNumbers.nextInt(4);
			int incorrect = 1 + randomNumbers.nextInt(4);

			System.out.printf("How much is %d times %d?\n", num1, num2);
			System.out.print("Enter your answer(-1 to exit) : ");
			int num = input.nextInt();
			if (num == -1) {
				break;
			}
			if (num == num1 * num2) {
				switch (correct) {
				case 1:
					System.out.println("Very good!");
					break;
				case 2:
					System.out.println("Excellent!");
					break;
				case 3:
					System.out.println("Nice work!");
					break;
				case 4:
					System.out.println("Keep up the good work!");
					break;
				}
			} else {
				while (true) {
					switch (incorrect) {
					case 1:
						System.out.println("No.Please try again.");
						break;
					case 2:
						System.out.println("Wrong. Try once more.");
						break;
					case 3:
						System.out.println("Don't give up!");
						break;
					case 4:
						System.out.println("No. Keep tring");
						break;
					}
					System.out.print("Enter your answer(-1 to exit) : ");
					num = input.nextInt();
					if (num == num1 * num2) {
						break;
					}
					incorrect = 1 + randomNumbers.nextInt(4);
				}
			}
		}
	}
}
