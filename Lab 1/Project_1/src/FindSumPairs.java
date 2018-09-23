
public class FindSumPairs {

	public static void main(String[] args) {
		int size = args.length;
		int sum = Integer.parseInt(args[size-1]);
		int pairSum;
		for(int i=0; i<size-2; i++){
			for(int j=i+1; j<=size-2; j++){
				pairSum= Integer.parseInt(args[i]) + Integer.parseInt(args[j]);
				if(pairSum==sum){
					System.out.println(args[i]+" "+args[j]);;
				}
			}
		}
	}

}
