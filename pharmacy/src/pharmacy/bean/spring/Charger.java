package pharmacy.bean.spring;

public class Charger {

	public boolean isWorking() {
		return working;
	}

	private String brand;
	private double price;
	private String color;
	private String volts;
	private boolean working;
	
	public Charger() {
		System.out.println("invoke no ars charger");
	}

	public Charger(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	System.out.println("invoke parameter charger"+brand);
	System.out.println("invoke parameter charger"+price);
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setVolts(String volts) {
		this.volts = volts;
	}

	@Override
	public String toString() {
		return "Charger [brand=" + brand + ", price=" + price + ", color=" + color + ", volts=" + volts + ", working="
				+ working + "]";
	}

	public void setWorking(boolean working) {
		this.working = working;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getVolts() {
		return volts;
	}
	

}
