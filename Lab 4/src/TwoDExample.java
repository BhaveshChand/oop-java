
public class TwoDExample {

	public static void main(String[] args) {
		// main method
		
		int[][] multi = new int[5][10];
		// most commonly used way of initializing
		System.out.println(multi);
		
		int[][] multi1 = new int[][] {
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		// above way shows the detailed initialization of array
		System.out.println(multi1);
		
		int[][] multi2 = new int[5][];
		for (int i = 0; i< 5; i++) {
			multi2[i] = new int[10];
		}
		// above method shows initializing elements with for loop
		System.out.println(multi2);
		
		int[][] multi3 = new int[5][];
		multi3[0] = new int[10];
		multi3[1] = new int[10];
		multi3[2] = new int[10];
		multi3[3] = new int[10];
		multi3[4] = new int[10];
		/* using this above method the arrays are initialized only by mentioning
		the row numbers first */
		System.out.println(multi3);
		
		// note you can use nested for loop for printing the array
	}

}
