
class TestCircle{
	public static void main(String args[]) {
		Circle c1 = new Circle(2.3);
		System.out.println(c1.area());

		// accessing static method with class name
		Circle.getCircumference(2.3);
		
		Circle c2 = new Circle(3.45);
		System.out.println(c2.area());
		
		// accessing static method with references is discouraged
		c2.getCircumference (3.45);
		
		/* 1. Make the area function as static and observe the output -> CANNOT REFER NONSTATIC VAR FROM STATIC METHOD
		2. Remove the formal argument from getCircumference()
			method and observe the output -> CANNOT REFER NONSTATIC VAR FROM STATIC METHOD
		3. Rename static to final and observe the error(s) and
			correctthem -> CANNOT MAKE STATIC REF TO NONSTATIC VAR*/

} // end of main
} // end of class
