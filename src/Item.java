public class Item{
	private String name;
	private int qty;
	private double unitPrice;
	private double total;

	
	Item(String name, int qty, double unitPrice){
		this.name = name;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	public String getName(){
		return name;
	}

	public int getQty(){
		return qty;
	}

	public double getUnitPrice(){
		return unitPrice;
	}

	public double getTotal(){
		total = this.qty * this.unitPrice; 
		return total;
	}

	@Override
	public String toString(){
		return "Name: " + name + 
			 "| Quantity: " + qty + 
			 "| Unit Price: " + unitPrice;
	}
}





















