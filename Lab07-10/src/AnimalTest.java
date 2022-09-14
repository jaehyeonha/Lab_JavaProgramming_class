//2021115737 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�
class Animal {
	public void show() {
		System.out.println("Animal : show()");
	}

	public void move() {
		System.out.println("Animal : move()");
	}
}

class Fish extends Animal {
	public void show() {
		System.out.println("Fish : show()");
	}

	public void draw() {
		System.out.println("Fish : draw()");
	}

	public void move() {
		System.out.println("Fish : move()");
	}
}

class GoldFish extends Fish {
	public void draw() {
		System.out.println("GoldFish : draw()");
	}

	public void move() {
		System.out.println("GoldFish : move()");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		// case 1.
		GoldFish goldfish = new GoldFish();
		goldfish.show();

		// case 2.
		Animal animal = new Fish();
		//animal.draw(); //animal class���� draw��� method�� ����

		// case 3.
		Animal animal2 = new Fish();
		animal2.show();
		animal2.move();

		// case 4.
		Animal animal3 = new GoldFish();
		((Fish) animal3).draw();
	}
}
