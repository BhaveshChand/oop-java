
public class Item {
	
	private String itemName;
	private String itemidNo;
	private int itemQuantity;
	private double itemPrice;
	
	Item(String name, String idNo, int quantity, int price){
		this(name,idNo,quantity);
		itemPrice = price;
	}
	Item(String name, String idNo, int quantity){
		this(name,idNo);
		itemQuantity = quantity;
	}
	Item(String name, String idNo){
		itemName = name;
		itemidNo = idNo;
		itemQuantity = 1;
		itemPrice = 500;
	}
	
	public String accessName(){
		return itemName;
	}
	public String accessidNo(){
		return itemidNo;
	}
	public int accessQuantity(){
		return itemQuantity;
	}
	public double accessPrice(){
		return itemPrice;
	}
	public void changeName(String name){
		itemName = name;
	}
	public void changeidNo(String idNo){
		itemidNo = idNo;
	}
	public void changeQuantity(int quantity){
		itemQuantity = quantity;
	}
	public void changePrice(double price){
		itemPrice = price;
	}
	

}
