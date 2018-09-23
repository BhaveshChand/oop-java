import java.util.Scanner;

public class TaxOnSalary {

	double salary;
	boolean isPANsubmitted;
	
	TaxOnSalary(boolean isPANsubmitted){
		this.isPANsubmitted = isPANsubmitted;
		salary = 100000;
	}
	TaxOnSalary(){
		isPANsubmitted = false;
		salary = 0;
	}
	
	double accessSalary(){
		return salary;
	}
	boolean accessPANsub() {
		return isPANsubmitted;
	}
	
	double calculateTax() {
		double tax=0;
		if(salary<180000) {
			if(isPANsubmitted) tax=0;
			else tax=0.05*salary;
		}
		else if(salary>=180000 && salary<500000) tax=0.1*salary;
		else if(salary>=500000 && salary<1000000) tax=0.2*salary;
		else if(salary>=1000000) tax=0.3*salary;
		return tax;
	}
	
	void inputSalary() {
		Scanner in = new Scanner(System.in);
		salary = in.nextDouble();
	}
	

}
