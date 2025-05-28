
public class Product{
	private String name;
	private int unitsBought;
	private double price;
	private double total;
	private final double VAT = .12;

	
	Product(String name, int unitsBought, double price, double total){
		this.name = name;
		this.unitsBought = unitsBought;
		this.price = price;
		this.total = unitsBought * price;
	}

	public String getName(){
		return name;
	}
	public int getUnitsBought(){
		return unitsBought;
	}
	public double getPrice(){
		return price;
	}
	public double getTotal(){
		return total;
	}

	//we need this for [ getTotal() - discountSubtrahend in main]
	public double setTotal(double value){
		return this.total = value;
	}
	public void printWithVAT(){

		System.out.println("\n\n======With VAT======");
		System.out.printf("Subtotal: P%.2f", total);

		double vatAdded = this.total * VAT;
		System.out.printf("\nVAT: P%.2f", vatAdded);

		double totalWithVAT = this.total + (this.total * VAT);
		System.out.printf("\nTotal with VAT: P%.2f", totalWithVAT);
	}

	@Override
	public String toString(){
		return "Name: " + name + 
			 " | Units Bought: " + unitsBought + 
			 " | Price: " + price +
			 " | Total: " + total ;
	}
}





