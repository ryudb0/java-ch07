package example;

public class Ex7_25 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		System.out.println(oi.iv);
		
//		Ex7_26
//		모르겠다.
		
//		Ex7_27
		Outer.Inner2 oi2 = o.new Inner2();
		oi2.method();
	}
}

class Outer {
//	Ex7_27
	int value = 10;
	
	class Inner2 {
		int value = 20;
		
		void method() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println("모르겠다 outer에 접근 어케하노 이런거 왜 만드노 진짜 줘패고싶게");
		}
	}
	
	class Inner {
		int iv = 100;
	}
	
//	Ex7_26
	static class StaticInner {
		int iv = 200;
	}
}
