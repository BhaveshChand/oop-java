
class Employee {
	String name;
	double salary;
	
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}

	public String getName() {
		return null;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return 0;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}
