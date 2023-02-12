package  com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Samosa() {
		super();
		
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	

	public void init() {
		System.out.print("init method for spring samosa");
	}
	
	public void destroy() {
		System.out.print("destroy method for spring samosa");
	}
	
}
 