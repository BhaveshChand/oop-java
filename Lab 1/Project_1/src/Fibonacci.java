
public class Fibonacci {

	public static void main(String[] args) {
		int a=1,b=1,c;
		int sum=a+b;
		int size=Integer.parseInt(args[0]);
		System.out.println("The first 20 Fibonacci numbers are:");
		System.out.print(a+" "+b+" ");
		for(int i=3; i<=size; i++){
			c=a+b;
			sum+=c;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.println();
		System.out.println("The average is "+(float)sum/size);
	}

}
