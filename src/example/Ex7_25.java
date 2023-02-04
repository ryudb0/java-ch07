package example;

public class Ex7_25 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		System.out.println(oi.iv);
		System.out.println("--------------------------------------");
		
//		Ex7_26
//		모르겠다.
		Outer.StaticInner os = new Outer.StaticInner();
//		Outer.StaticInner os2 = o.new StaticInner();  // 이렇게 접근했어
		System.out.println(os.iv);
		System.out.println("--------------------------------------");
		
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
			System.out.println(Outer.this.value);
//			System.out.println(Outer.super.value);		// 이런식으로 접근했어 ㅋㅋ
//			System.out.println(super.value);
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
