package src.Cats;

public class Cats {
	
	private int height; 
	private String name;
	private Boolean amIFluffy;
	/**
	 * @param height
	 * @param name
	 */
	public Cats(int height, String name, Boolean amIFluffy) {
		super();
		this.height = height;
		this.name = name;
		this.amIFluffy = amIFluffy;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getAmIFluffy() {
		return amIFluffy;
	}

	public void setAmIFluffy(Boolean amIFluffy) {
		this.amIFluffy = amIFluffy;
	}

	@Override
	public String toString() {
		return "Cats [height=" + height + ", name=" + name + ", amIFluffy=" + amIFluffy + "]";
	}
	
}
