import java.util.StringTokenizer;

class Name {
	private String fname; // First Name
	private String mname; // Middle Name
	private String lname; // Last Name
	
	// provide accessor methods as per the given specification
	public String getFname() {
		return fname;
	}
	public String getMname() {
		return mname;
	}
	public String getLname() {
		return lname;
	}

	// provide implementation for getName() method as per the given specification
	public String getName() {
		return fname+" "+mname+" "+lname;
	}
	
	public String toString() {
		return fname+mname+lname;
	}
	
	Name(String name) {
		/* Complete the constructor by extracting the values of three name
			fields. Note that name value may be either comma separated or
			semicolon separated */
		StringTokenizer st;
		if(name.indexOf(",")!=-1) {
			st = new StringTokenizer(name,",");
			fname = st.nextToken();
			mname = st.nextToken();
			lname = st.nextToken();
		}
		else if(name.indexOf(";")!=-1) {
			st = new StringTokenizer(name,";");
			lname = st.nextToken();
			mname = st.nextToken();
			fname = st.nextToken();
		}
	}
} // End of class Name.
