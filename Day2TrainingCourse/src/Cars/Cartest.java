package Cars;

public class Cartest {

	public static void main(String[] args) {
		// create new car using default constructor
		
		Car car1 = new Car("Skoda", "Fabia");
		
		car1.setColour("grey");
		car1.setCost(50000);
		

		System.out.println("car1's make is " + car1.getMake() + " and its model is " + car1.getModel() + " " + car1.toString());
	}

}
