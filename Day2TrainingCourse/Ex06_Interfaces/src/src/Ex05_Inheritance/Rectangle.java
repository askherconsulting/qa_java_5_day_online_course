package src.Ex05_Inheritance;

public class Rectangle extends Shape {
	//fields not required in Shape
	private double height;
	private double width;
	
	//constructor with super call to Shape
	public Rectangle(String name, String colour, double x, double y, int height, int width) {
		super(name, colour, x, y);
		this.height=height;
		this.width=width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", getName()=" + getName() + ", getColour()="
				+ getColour() + ", getX()=" + getX() + ", getY()=" + getY() + ", toString()=" + super.toString()
				+ ", getArea()=" + getArea() + ", getCentrePoint()=" + getCentrePoint() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	//correct answer implementation is return (width == height);
	public boolean isSquare() {
		if(height == width) {
			return true;
		} else return false;
	}
	
	@Override
	public double getArea() {
		return height * width;
	}
	
	@Override
	public Point getCentrePoint() {
		double centreX = getX() + width/2;
		double centreY = getY() + height/2;
		return new Point(centreX, centreY);		
	}

}
