package ASSIGNMENT50;

public class ShapeMain {

	public static void main(String[] args) {
		Shape shape = new Shape();

		double squareSide = 5.0;
		shape.printArea(squareSide);
		shape.printPerimeter(squareSide);

		double length = 4.0;
		double breadth = 6.0;
		shape.printArea(length, breadth);
		shape.printPerimeter(length, breadth);
	}
}
