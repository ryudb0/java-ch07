package example;

public class Ex7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+",");
		}
		System.out.println();
		System.out.println(deck.pick(0));
		
	}
}

class SutdaDeck {
	final int CARD_NUM = 20;
	final SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			boolean isKwang = false;
			if(i+1== 1 || i+1 == 3 || i+1 == 8) {
				isKwang = true;
			}
			cards[i] = new SutdaCard(i%10+1, isKwang);
		}
	}
	
	void shuffle() {
		for(int i =0; i<cards.length; i++) {
			int random = (int)(Math.random()*cards.length);
			SutdaCard tmp = cards[i];
			cards[i] = cards[random];
			cards[random] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		return pick((int)(Math.random()*cards.length));
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
//	Ex7_14
//	외부에서 생성자를 못만들게 막아야하는데 여길 막아버리면 SutdaDeck에서 생성자를 사용할수가없다.
//	어떻게 해야하지?
//	멤버변수를 final로 만들면 변경이 불가하다.
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}