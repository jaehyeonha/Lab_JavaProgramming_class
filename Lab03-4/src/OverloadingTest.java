// 2021115737 ������
// ������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

public class OverloadingTest{
	public static void main(String[] args)
	{
		System.out.printf("������ ��: %d\n",sum(5,6));
		System.out.printf("�Ǽ��� ��: %f\n",sum(5.1,6.2));
	}
	
	public static int sum(int num1, int num2)
	{
		System.out.printf("����: %d, %d\n",num1,num2);
		return num1+num2;
	}
	public static double sum(double num1, double num2)
	{
		System.out.printf("�Ǽ�: %f, %f\n",num1,num2);
		return num1+num2;
	}
}
