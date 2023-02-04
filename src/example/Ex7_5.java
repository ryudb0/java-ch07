package example;

public class Ex7_5 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());			//100
		b.buy(new Computer());		//200
		b.buy(new Tv());			//100
		b.buy(new Audio());			//50
		b.buy(new Computer());		//200
		b.buy(new Computer());		//200
		b.buy(new Computer());		//200
		
		b.summary();
		
	}
}

//	Ex7_19
class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 "+p+"을/를 구매할 수 없습니다.");
			return;
		}
		money -= p.price;
		add(p);
	}
	
	void add(Product p) {
		if(i >= cart.length) {
			Product[] tmp = new Product[cart.length * 2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		cart[i] = p;
		i++;
	}
	
	void summary() {
		String list = "";
		int sum = 0;
		for(int i=0; i<cart.length; i++) {
			list += cart[i] + ",";
			sum += cart[i].price;
		}
		System.out.printf("구입한 물건:%s%n사용한 금액:%d%n남은 금액:%d%n	", list, sum, money);
	}
}

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product() {}
}

class Tv extends Product {
	Tv() {
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}