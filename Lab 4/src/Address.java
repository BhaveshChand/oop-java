
public class Address {
	String line1,line2,line3,pin;
	char[] city,state;
	
	Address(String str){
		String[] splitstr = str.split("$");
		line1 = splitstr[1];
		line2 = splitstr[2];
		line3 = splitstr[3];
		city = splitstr[4].toCharArray();
		state = splitstr[5].toCharArray();
		pin = splitstr[6];
	}

	public String getLine1() {
		return line1;
	}

	public String getLine2() {
		return line2;
	}

	public String getLine3() {
		return line3;
	}

	public String getPin() {
		return pin;
	}

	public String getCity() {
		return new String(city);
	}

	public String getState() {
		return new String(state);
	}
	

}
