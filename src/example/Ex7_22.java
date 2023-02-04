package example;

public class Ex7_22 {

}

class Point {
	int x, y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}

abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point());
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
	
	abstract double calcArea() ;
}