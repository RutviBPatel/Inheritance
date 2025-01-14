package Inheritance;

public class rectangle {
	protected double length;
    protected double breadth;

    public rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void printArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}
