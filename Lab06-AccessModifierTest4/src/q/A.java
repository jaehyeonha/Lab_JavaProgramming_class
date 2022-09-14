package q;

import p.B;

class A {
	void f() {
		B b = new B();
		//b.n = 3;
		//b.g();
	}//private는 같은 패키지의 같은 클래스가 아니면 어디서든 사용 불가능
}
