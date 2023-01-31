import java.util.Vector;

public class Ex7_21 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Tv2 tv = new Tv2();
		Computer2 com = new Computer2();
		Audio2 audio = new Audio2();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
		
		
		
	}
}

class Product2 {
	int price;
	int bonusPoint;
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product2() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv2 extends Product2 {
	Tv2() {super(100);}
	
	public String toString() {return "Tv2";}
}

class Computer2 extends Product2 {
	Computer2() {super(200);}
	public String toString() {	return "Computer2";}
}

class Audio2 extends Product2 {
	Audio2() { super(50); }
	public String toString() { return "Audio";}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector(); 
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"를 구매하셨습니다.");
	}
	
	void refund(Product2 p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum =0;
		String itemList = "";
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Product2 p = (Product2)item.get(i);
			sum += p.price;
			itemList += (i==0) ? ""+p : ", "+p;
		}
		System.out.println("구입하신 총 금액은 "+sum+"만원입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
		
}