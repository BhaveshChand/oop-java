import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		int sum=0;
		for(int i=0;i<10;i++){
			sum+= in.nextInt();
		}
		System.out.println("Sum is: "+sum);

	}

}
