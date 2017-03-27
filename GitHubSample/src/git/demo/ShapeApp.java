package git.demo;

public class ShapeApp {

	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.drawShape();
		
		shape = new Triangle();
		shape.drawShape();
	}

}
