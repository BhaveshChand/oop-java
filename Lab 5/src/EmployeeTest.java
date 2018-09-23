
class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ramesh",50000);
		//Manager m1 = (Manager)new Employee("Suresh",10000); //ERROR
		Manager m2 = new Manager("Mukesh",100000,"HR");
		Employee e2 = new Manager("Harish",500000,"IT");	//Child obj to parent ref
		
		System.out.println(e1+e1.getName()+e1.getSalary());	//Normal, calls own methods
		//System.out.println(m1);
		System.out.println(m2+m2.getDept()+m2.getName()+m2.getSalary());	//Normal, calls own methods
		System.out.println(e2+e2.getName()+e2.getSalary());	//getDept not avbl for parent reference, rest methods called from child hence RunTimePoly
	}

}
