//2021115737 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�
class Animal {
	public void show() {
		System.out.println("Animal : show()");
	}
}

class Fish extends Animal {
	public void draw() {
		System.out.println("Fish : draw()");
	}
}

class GoldFish extends Fish {
	public void move() {
		System.out.println("GoldFish : move()");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Fish fish = new GoldFish();
		if (fish instanceof GoldFish)
			((GoldFish) fish).move();
	}
}
