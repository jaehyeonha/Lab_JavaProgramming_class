//2021115737 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�
class Animal {
	public void move() {
		System.out.println("Animal : move()");
	}

	public void show() {
		System.out.println("Animal : show()");
	}
}

class Fish extends Animal {
	public void draw() {
		System.out.println("Fish : draw()");
	}

	public void move() {
		System.out.println("Fish : move()");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Fish fish = new Fish();
		fish.move();
	}
}