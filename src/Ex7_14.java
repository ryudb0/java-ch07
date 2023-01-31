
public class Ex7_14 {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
	}
}

final class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {
//		private 생성자입니다.
	}
	
	public static Singleton getInstance() {
		if(s==null) {
			s = new Singleton();
		}
		return s;
	}
}
