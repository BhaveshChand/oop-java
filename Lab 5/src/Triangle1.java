// Define Triangle, subclass of Shape 
public class Triangle1 extends Shape1 { 
	// Private member variables 
	private int base; 
	private int height; 
	
	// Constructor 
	public Triangle1(String color, int base, int height) { 
		super(color); 
		this.base = base; 
		this.height = height; 
	}
	
	@Override 
	public String toString() { 
		return "Triangle of base=" + base + " and height=" + height + ", subclass of " + super.toString(); 
	}
	
	@Override 
	public double getArea() {
		return 0.5*base*height;
	}
}