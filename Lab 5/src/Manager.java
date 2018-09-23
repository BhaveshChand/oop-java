
class Manager extends Employee{
	String dept;
	
	Manager(String name, double salary, String dept){
		super(name,salary);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return super.name;
	}
	public void setName(String name) {
		super.name = name;
	}
	public double getSalary() {
		return super.salary;
	}
	public void setSalary(double salary) {
		super.salary = salary;
	}
	
	@Override
	public String toString() {
		//local methods have higher preference
		return "Manager [dept=" + dept + ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}
	
	
}
