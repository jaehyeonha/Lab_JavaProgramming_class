//2021115737 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�
public class FriendTest {
	public static void main(String[] args) {
		String[] names = { "������", "��ȣ��", "�賲��" };
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
