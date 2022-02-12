package pharmacy.bean.spring;

public class Ups {

	private String Company;
	private String type;
	private double weight;
	private float backUpHour;
	private float chargeHour;
	
	public Ups() {
		System.out.println("create ups");
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public float getBackUpHour() {
		return backUpHour;
	}

	public void setBackUpHour(float backUpHour) {
		this.backUpHour = backUpHour;
	}

	public float getChargeHour() {
		return chargeHour;
	}

	public void setChargeHour(float chargeHour) {
		this.chargeHour = chargeHour;
	}
	
}
