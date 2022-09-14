//2021115737 하재현
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다
class Animal {
	public void show() {
		System.out.println("Animal : show()");
	}

	public void move() {
		System.out.println("Animal : move()");
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
		fish.move();
	}
}
