package Ex05_Inheritance;

public class Circle extends Shape {

	

	private double radius;
	
	public Circle(String name, String colour, double x, double y, double radius) {
		super(name, colour, x, y);
		// TODO Auto-generated constructor stub
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
		return radius = (java.lang.Math.PI * radius);
	}
}
