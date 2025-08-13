package src.Ex05_Inheritance;

public class TestShape {
	
	public static void main(String[] args) {
		
		//exercise 6.1.3 testing implemented methods
		Circle hole = new Circle("hole", "green", 5.0, 5.0, 5.0);
		System.out.println("the current position is" + hole.getCurrentLocation() + "\n");
		hole.move(1, 2);
		System.out.println("the new position is" + hole.getCurrentLocation());
		
	}

}
