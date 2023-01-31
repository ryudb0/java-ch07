
public class Ex7_15 {
	public static void main(String[] args) {
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		
//		fe.water();
//		car = fe;
////		car.water();	// car타입의 리모콘에는 water()메서드가 없다.
//		fe2 = (FireEngine) car;
//		fe2.water();
		
//		Ex7_16
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;
		fe.drive();
		car2 = fe;
		car2.drive();
		
		
		
	}
	
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("dirve, Brrrrrrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!!!!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water~~~~~");
	}
}