
public class test_b {

	static int y;
	int z;
	
	public static void main(String[] args) {
		System.out.println(method1());
	}

	public static int method1(){
		/*static*/ int x=0;
		y=15;
		//z=5;
		return ++x;
	}
}
