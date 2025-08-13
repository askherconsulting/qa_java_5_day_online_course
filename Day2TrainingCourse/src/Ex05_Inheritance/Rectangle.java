package Ex05_Inheritance;

public class Rectangle extends Shape {

	private int height;
	private int width;
	
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
	
	public boolean isSquare(int height, int width) {
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
		this.getX();
		this.getY();
		//TODO
		return null;
		
	}

}
