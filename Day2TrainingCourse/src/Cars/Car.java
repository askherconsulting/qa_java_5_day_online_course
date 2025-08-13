package Cars;

public class Car {
	
	/*private means it can only be changed by the methods in this class
	recommended best practice 
	*/
	
	/* 
	 * protected means do you want the child classes to be able to change it. 
	 * convention is to use it on methods, and use the accessor methods to access the field values
	 * classes in the same package can access this method or field (even if not sub-classes)
	 */
	
	private String make;	
	private String model;
	private int yearModel;
	private String reg;
	private String colour; 
	private int cost;
	private String [] features = {"seat belts", "rear camera"};
	
	//constructor - default only exists if you havent specified a constructor yourself
	//otherwise you need to add in a default explicitly
	//to generate in eclipse go to source -> generate constructor
	/**
	 * @param make
	 * @param model
	 */
	public Car(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}
	
	//gets and sets
	
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String[] getFeatures() {
		return features;
	}
	public void setFeatures(String[] features) {
		this.features = features;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYearModel() {
		return yearModel;
	}
	
	//in eclipse, to generate a toString method, you can go to Source -> GenerateToString
	//@override is used to override the behaviour of the abstract methods from the parent class
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + "]";
	}
	
	
}
