
public class Customer {
	
	private String name;
	private String idNo;
	private double balance;
	private Item item;
	
	Customer(String name, String idNo, double balance){
		this(name,idNo);
		this.balance = balance;
	}
	Customer(String name, String idNo){
		this.name = name;
		this.idNo = idNo;
		balance = 5000;
	}
	
	public String accessName(){
		return name;
	}
	public String accessidNo(){
		return idNo;
	}
	public double accessBalance(){
		return balance;
	}
	public Item accessItem(){
		return item;
	}
	
	public void changeName(String name){
		this.name = name;
	}
	public void changeidNo(String idNo){
		this.idNo = idNo;
	}
	
	public void print(){
		System.out.println("Name of item purchased: "+item.accessName());
		System.out.println("ID No of item purchased: "+item.accessidNo());
		System.out.println("Quantity purchased: "+item.accessQuantity());
		System.out.println("Price of item purchased: "+item.accessPrice());
		System.out.println("Remaining balance: "+balance);
	}
	
	public void buyItem(Item item){
		int quantity = item.accessQuantity();
		double price = item.accessPrice();
		if(quantity>=1 && balance>=quantity*price){
			this.item = item;
			System.out.println("Name of item purchased: "+item.accessName());
			System.out.println("ID No of item purchased: "+item.accessidNo());
			System.out.println("Quantity purchased: "+quantity);
			System.out.println("Price of item purchased: "+price);
			balance-=quantity*price;
			System.out.println("Remaining balance after purchase: "+balance);
		}
		else if(balance<quantity*price) System.out.println("Insufficient balance");
		else if(quantity<1) System.out.println("Order is not valid");
	}
	
}
