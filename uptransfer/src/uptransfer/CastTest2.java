package uptransfer;

class Shape2 {
	static void draw(Shape2 s) {
	        System.out.println("Shape2 draw.");
	    }
	}

class Circle2 extends Shape {
	static void draw(Circle2 c) {
	        System.out.println("Circle2 draw.");
	    }
	}

public class CastTest2 {
    public static void drawInTest(Shape2 s) {
        s.draw(s);
    }
    public static void main(String args[]) {
        Circle c = new Circle();
        drawInTest(c);
    }
}