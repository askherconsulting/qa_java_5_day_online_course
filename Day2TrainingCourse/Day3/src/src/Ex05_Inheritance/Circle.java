package src.Ex05_Inheritance;

public class Circle extends Shape {

	//fields
	private double radius;
	
	//constructor	
	public Circle(String name, String colour, double x, double y, double radius) {
		super(name, colour, x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getName()=" + getName() + ", getColour()=" + getColour() + ", getX()="
				+ getX() + ", getY()=" + getY() + ", toString()=" + super.toString() + ", getArea()=" + getArea()
				+ ", getCentrePoint()=" + getCentrePoint() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public Point getCentrePoint() {
		return new Point(getX(), getY());
	}
}
