package src.Ex05_Inheritance;

public class TestShape {
	
	public static void main(String[] args) {
		// create some objects
		Rectangle iphone = new Rectangle("iphone", "red", 10.0, 5.0, 20, 50);
		Rectangle picture = new Rectangle("picture", "blue", 1.0, 7.0, 2, 5);
		Circle blob = new Circle("blobby picture", "yellow", 10.0, 10.0, 10.0);
		
		//print out the objects
		System.out.println(picture.toString()+ "\n");
		System.out.println(iphone.toString()+ "\n");
		System.out.println(blob.toString()+ "\n");
		
		System.out.println("the iphone area is " + iphone.getArea() + "\n");
		System.out.println("the picture area is " + picture.getArea() + "\n");
		System.out.println("the blob area is " + blob.getArea() + "\n");
		System.out.println("the blob centre point is " + blob.getCentrePoint());
		
		
		
	}

}
