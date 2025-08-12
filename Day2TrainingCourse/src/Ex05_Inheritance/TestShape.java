package Ex05_Inheritance;

public class TestShape extends Shape {

	public TestShape(String name, String colour, double x, double y, int height, int width) {
		super(name, colour, x, y);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle iphone = new Rectangle("iphone", "red", 10.0, 5.0, 20, 50);
		Rectangle picture = new Rectangle("picture", "blue", 1.0, 7.0, 2, 5);
		
		Circle blob = new Circle("blobby picture", "yellow", 10.0, 10.0, 10.0);
		
		System.out.println(picture.toString()+ "\n");
		System.out.println(iphone.toString()+ "\n");
		
		System.out.println("the iphone area is " + iphone.getArea() + "\n");
		System.out.println("the picture area is " + picture.getArea() + "\n");
		System.out.println("the blob area is " + blob.getArea() + "\n");
		
		
		
	}

}
