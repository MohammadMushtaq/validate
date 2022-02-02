package pharmacy.bean;

public class Doctor {
	
	public Doctor() {
		System.out.println(getClass().getSimpleName().concat(" doctor no -args constructor"));
	}
	
	void treat() {
		System.out.println("invoke the treat method");
	}
}
