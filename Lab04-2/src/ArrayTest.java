//2021115737 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�
public class ArrayTest {
	public static void main(String[] args) {
		int[][] array = new int[3][];
		array[0] = new int[2];
		array[1] = new int[1];
		array[2] = new int[3];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				array[i][j] = 1;
		}
		for (int[] i : array) {
			for (int j : i) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}
	}
}
