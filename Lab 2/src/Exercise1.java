import java.io.*;

public class Exercise1 {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr =	new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("Enter 10 numbers: ");
		int sum=0;
		for(int i=0;i<10;i++){
			sum+= Integer.parseInt(br.readLine());
		}
		System.out.println("Sum is: "+sum);
	}

}
