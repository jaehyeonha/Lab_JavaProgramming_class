//2021115737 하재현
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다
public class FriendTest {
	public static void main(String[] args) {
		String[] names = { "전정국", "정호석", "김남준" };
		int[] ages = { 1997, 1994, 1994 };

		Friend array[] = new Friend[3];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Friend(names[i], ages[i]);
		}
		for (int i = 0; i < 3; i++) {
			System.out.printf("%s\n", array[i]);
		}
		for (Friend i : array)
			System.out.printf("%s\n", i);
	}
}

class Friend {
	private String names;
	private int ages;

	public Friend(String names, int ages) {
		this.names = names;
		this.ages = ages;
	}

	public String toString() {
		return names + ages;
	}
}
