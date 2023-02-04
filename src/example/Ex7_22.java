package example;

public class Ex7_22 {
	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
		System.out.println("면적의 합:"+sumArea(arr));
	}
	
	static double sumArea(Shape[] s) {
		double sum = 0;
		for(int i=0; i<s.length; i++) {
			sum += s[i].calcArea();
		}
		return sum;
	}
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

class Circle extends Shape {
	double r; // 반지름
	
	Circle() {
		this(new Point(), 1);
	}
	
	Circle(double r) {
		this(new Point(), r);
	}
	
	Circle(Point p, double r) {
		this.p = p;			//super(p);
		this.r = r;
	}
	
	double calcArea() {
		return r*r*Math.PI ;
	}
}

class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle() {
		this(new Point(), 1, 1);
	}
	
	Rectangle(double width, double height) {
		this(new Point(), width, height);
	}
	
	Rectangle(Point p, double width, double height) {
		this.p = p;				// super(p);
		this.width = width;
		this.height = height;
	}
	
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() {
		if(width == height) {
			return true;
		}
		return false;
	}
}
