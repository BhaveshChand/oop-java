
public class RetailStoreExample extends RetailStore1{

	public static void main(String[] args) {
		int index; 
		RetailStore1 retailOne = new RetailStore1();
		
		String description = retailOne.fetchDescription(1004); 
		
		// below line illustrates the use of split function of String class 
		String StringArray[]; 
		// below line split the string and stores the splitted values to an array 
		StringArray = description.split("\\s"); 
		
		/* this commented code illustrates the use of StringTokenizer to achieve 
		 * the same functionality of split method 
		 * 
		 * StringTokenizer st = new StringTokenizer(description); 
		 * StringArray = new String[st.countTokens()]; 
		 * for (int i=0; st.hasMoreTokens(); i++) { 
		 * 	StringArray[i] = st.nextToken(); 
		 * }
		 */ 
		String type = StringArray[2];
		System.out.println("the type of the item is " + type);
		System.out.println("the charactor at starting position is " + type.charAt(0));
		
		// below line will find the location of the symbol "-" 
		index = type.indexOf('-'); 
		
		String stringFromSubstring = type.substring(index + 1);
		System.out.println("the price computed using the substring method is " + stringFromSubstring); 
		
		String stringFromDouble = Double.toString(new RetailStore1().computePrice(1004));
		System.out.println("the price of the item computed using double.toString method is "+ stringFromDouble);
		
		String truncatedPrice = stringFromDouble.substring(0, stringFromDouble.indexOf('.'));
		if(stringFromSubstring.equals(truncatedPrice)) System.out.println("Both the above prices are same value");
	}

}
