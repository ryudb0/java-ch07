package example;

public class Ex7_17 {

}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		//		현재위치에서 스탑
	}
}

class Marine extends Unit {
	void move(int x, int y) {
		
	}
	void stimPack() {
		
	}
}

class Tank extends Unit {
	void move(int x, int y) {
		
	}
	void changeMode() {
		
	}
}

class Dropship extends Unit {
	void move(int x, int y) {
		
	}
	void load() {
		
	}
	void unload() {
		
	}
}