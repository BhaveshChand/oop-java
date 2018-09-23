
public class TestStore {

	public static void main(String[] args) {
		Customer c = new Customer("Bhavesh","715");
		System.out.println(c.accessName()+c.accessidNo()+c.accessBalance());
		
		Item i1 = new Item("Copy","001");
		Item i2 = new Item("Book","002");
		
		c.buyItem(i1);
		System.out.println(c.accessName()+c.accessidNo()+c.accessBalance());
		
		c.buyItem(i2);
		System.out.println(c.accessName()+c.accessidNo()+c.accessBalance());
		
	}

}
