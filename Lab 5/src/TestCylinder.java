// A test driver program for Cylinder class 
public class TestCylinder { 
	public static void main(String[] args) { 
		Cylinder cy1 = new Cylinder();	// Use constructor 1 
		System.out.println("Radius is " + cy1.getRadius() + " \nHeight is " + cy1.getHeight() + " \nColor is " + cy1.getColor() + " \nBase area is " + cy1.getArea() + " \nVolume is " + cy1.getVolume());
		
		Cylinder cy2 = new Cylinder(5.0, 2.0);	// Use constructor 2 
		System.out.println("Radius is " + cy2.getRadius() + " \nHeight is " + cy2.getHeight() + " \nColor is " + cy2.getColor() + " \nBase area is " + cy2.getArea() + " \nVolume is " + cy2.getVolume());
	}
}