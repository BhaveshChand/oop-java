
public class TestShape1 {

	public static void main(String[] args) {
		Shape1 s1 = new Rectangle1("red", 4, 5); 
		System.out.println(s1); 
		System.out.println("Area is " + s1.getArea()); 
		
		Shape1 s2 = new Triangle1("blue", 4, 5); 
		System.out.println(s2);
		System.out.println("Area is " + s2.getArea()); 
		
		// Cannot create instance of an abstract class 
		//Shape1 s3 = new Shape1("green");	// Compilation Error!!
	}

}
