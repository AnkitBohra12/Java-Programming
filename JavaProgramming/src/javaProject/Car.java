package javaProject;

public class Car {
	
	String company;
	String colour;
	Engine e;
	
	Car(String company, String colour, Engine e){
		this(e);
		this.company = company;
		this.colour = colour;
		
	}
	
	Car(Engine e){
		this.e=e;
	}
	
	public void drive() {
		System.out.println("Driving the car");
	}
	
	public void park() {
		System.out.println("Parking the car");
	}

}
