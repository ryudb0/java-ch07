package example;

public class Ex7_7 {
	public static void main(String[] args) {
		Child c = new Child();
		
		System.out.println("x="+c.x);	// 1000
		
		
//		메서드영역에 Parent와 Child가 올라간다.
//		Parent 에 x먼저 초기화 100후 Child x 초기화 3000
//		Child() 호출 Child(int x) 호출 super()호출
//		Parent x에 Parent(int x) 호출
	}
}

class Parent {
	int x =100;
	
	Parent() {
		this(200);
	}
	Parent(int x) {
		this.x=x;
	}
	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;
	
	Child() {
		this(1000);
	}
	
	Child(int x) {
		this.x=x;
	}
	
}