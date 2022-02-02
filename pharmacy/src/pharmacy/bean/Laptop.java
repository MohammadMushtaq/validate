package pharmacy.bean;

public class Laptop {

	public Laptop() {
		System.out.println(getClass().getSimpleName().concat(" laptop no -args constructor"));
	}
	
	public void start() {
		System.out.println("invoke the start method un laptop");
	}
}
