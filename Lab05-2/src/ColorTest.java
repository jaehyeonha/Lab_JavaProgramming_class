//2021115737 하재현
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.
import java.util.EnumSet;

enum MyColor {
	WN("WHITE", "Nina"), BY("BLACK", "Yuna"), YS("YELLOW", "Sumi"), RM("RED", "Mimi");

	private final String color;
	private final String name;

	MyColor(String color, String name) {
		this.color = color;
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}
}

public class ColorTest {
	public static void main(String[] args) {
		for (MyColor mycolor : MyColor.values())
			System.out.printf("%s-%s\n", mycolor.getColor(), mycolor.getName());

		System.out.println();

		for (MyColor mycolor : EnumSet.range(MyColor.BY, MyColor.YS))
			System.out.printf("%s-%s\n", mycolor.getColor(), mycolor.getName());
	}
}
