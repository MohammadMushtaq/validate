package pharmacy.bean.spring;

public class ToothPaste {
	private String company;
	private double price;
	private boolean offer;
	private boolean ml;
	private boolean salt;
	private String brandAmbassodor;

	public ToothPaste() {
		System.out.println("invoked tooth paste");
	}

	public ToothPaste(String company, double price, boolean offer, boolean ml) {
		super();
		this.company = company;
		this.price = price;
		this.offer = offer;
		this.ml = ml;
	}

	@Override
	public String toString() {
		return "ToothPaste [company=" + company + ", price=" + price + ", offer=" + offer + ", ml=" + ml + ", salt="
				+ salt + ", brandAmbassodor=" + brandAmbassodor + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSalt() {
		return salt;
	}

	public void setSalt(boolean salt) {
		this.salt = salt;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setOffer(boolean offer) {
		this.offer = offer;
	}

	public void setMl(boolean ml) {
		this.ml = ml;
	}

	public String getCompany() {
		return company;
	}

	public boolean isOffer() {
		return offer;
	}

	public boolean isMl() {
		return ml;
	}

	public String getBrandAmbassodor() {
		return brandAmbassodor;
	}

	public void setBrandAmbassodor(String brandAmbassodor) {
		this.brandAmbassodor = brandAmbassodor;
	}
	

}
