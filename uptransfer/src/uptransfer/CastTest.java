package uptransfer;

class Shape {
	static void draw(Shape s) {
	        System.out.println("Shape draw.");
	    }
	}

class Circle extends Shape {
	static void draw(Circle c) {
	        System.out.println("Circle draw.");
	    }
	}

public class CastTest {
	    public static void main(String args[]) {
	        Circle c = new Circle();
	        Shape.draw(c);
	    }
	}