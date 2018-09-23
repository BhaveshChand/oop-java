import java.util.Scanner;

class Test{
	public static Student readStudent() /*throws IOException*/{
		/* This method reads the student details and returns the Student instance.
			Values to be read from System.in are:
			1. First name of Student, 2. Middle name of student, 3. Last name of
			Student, 4. Name format (1 for comma(,) separated and 2 for semicolon
			separated), 5. age of student */
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter First name of Student");
		String fname = in.next();
		System.out.println("Enter Middle name of Student");
		String mname = in.next();
		System.out.println("Enter Last name of Student");
		String lname = in.next();
		int format = 0;
		String name = "";
		while(format!=1 && format!=2){
			System.out.println("Enter Name format (1 for first-middle-last and 2 for last-middle-first");
			format = in.nextInt();
			if(format==1) name = fname+','+mname+','+lname;
			else if(format==2) name = lname+';'+mname+';'+fname;
		}
		System.out.println("Enter age of student");
		int age = in.nextInt();
	
		return new Student(new Name(name),age);
	} // End of readStudent() Method

	public static void main(String args[]) /*throws IOException*/{
		/* 1. Write java code for reading details of 10 students and add them
			in the static list ofStudentListclass.*/
		Scanner in = new Scanner(System.in);
		for(int i=0;i<10;i++){
			System.out.println("Add details of Student No."+(i+1));
			StudentList.addStudent(readStudent());
		}
		
		/* 2. Write java code for displaying the all the students with age 20 from
			static list field of StudentList class*/
		Student[] agelist = StudentList.getStudentsWithAge(20);
		if(agelist==null) System.out.println("No students with age 20");
		else{
			int i=0;
			while(agelist[i]!=null){
				System.out.println(agelist[i]);
				i++;
			}
		}
		
		/* 3. Write java code for displaying the student details for all students
			having last name “Sharma” from static list of StudentList class*/
		Student[] lnamelist = StudentList.getStudentsWithLastName("Sharma");
		if(lnamelist==null) System.out.println("No students with last name Sharma");
		else{
			int i=0;
			while(lnamelist[i]!=null){
				System.out.println(lnamelist[i]);
				i++;
			}
		}
		
		/* 4. Write java code for displaying all the students whose age falls in
			the range minAge = 16 and maxAge = 20 from static list of StudentList
			class*/
		Student[] agerangelist = StudentList.getStudentsInRange(16, 20);
		if(agerangelist==null) System.out.println("No students with age 16-20");
		else{
			int i=0;
			while(agerangelist[i]!=null){
				System.out.println(agerangelist[i]);
				i++;
			}
		}
	}// End of main() Method
}// End of Test class
