
public class TestTax {

	public static void main(String[] args) {
		TaxOnSalary tax1 = new TaxOnSalary(true);
		TaxOnSalary tax2 = new TaxOnSalary();
		
		tax1.inputSalary();
		tax2.inputSalary();
		
		System.out.println("Tax for tax1: "+tax1.calculateTax());
		System.out.println("Tax for tax2: "+tax2.calculateTax());
	}

}
