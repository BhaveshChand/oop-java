
class Student {
	private Name name; // name of student
	private int age;// age of student
	
	/* Complete the Student class by adding proper constructor, accessor methods and
	by adding any other method which are required as per specification */
	Student(Name name, int age) {
		this.name = name;
		this.age = age;
	}

	public Name getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return name.getName()+" "+age;
	}
}// End of Student class
