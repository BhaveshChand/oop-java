
class StudentList {
	public static Student[] list = new Student[10]; // list of students
	public static int count =0; // count of students added in the list

	public static void addStudent(Student std) {
		if(count>= 20) return; // if count is already 20 or more then return
		list[count] = std;
		count++;
	}
	
	public static Student[] getStudentsWithAge(int age) {
		/* This method returns all the students whose age is equal to age
			parameter of this method. If no such student is found then it
			returns null. */
		Student[] sl = new Student[10];
		int matchcount = 0;
		for(int i=0; i<count; i++){
			if(list[i].getAge()==age) {
				sl[matchcount] = list[i];
				matchcount++;
			}
		}
		if(matchcount==0) return null;
		else return sl;		
	}
	
	public static Student[] getStudentsWithLastName(String lastName) {
		/* This method returns all the students whose last name attribute
			value matches with lastName parameter of this method. If no such
			students is found then it returns null. */
		Student[] sl = new Student[10];
		int matchcount = 0;
		for(int i=0; i<count; i++){
			if(list[i].getName().getLname()==lastName) {
				sl[matchcount] = list[i];
				matchcount++;
			}
		}
		if(matchcount==0) return null;
		else return sl;	
	}

	public static Student[] getStudentsInRange(int minAge, int maxAge) {
		/* This method returns all the students whose age falls between minAge
			and maxAge (both parameters inclusive) */
		Student[] sl = new Student[10];
		int matchcount = 0;
		for(int i=0; i<count; i++){
			if(list[i].getAge()>=minAge && list[i].getAge()<=maxAge) {
				sl[matchcount] = list[i];
				matchcount++;
			}
		}
		if(matchcount==0) return null;
		else return sl;	
	}
}// End of class StudentList
