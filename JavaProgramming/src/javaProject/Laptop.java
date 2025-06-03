package javaProject;

public class Laptop {
	
	 int ram;
	 double price;
	 
	 Laptop(){
		 
	 }
	
	public void display(){
		System.out.println("RAM of laptop : " + ram);
		System.out.println("Price of laptop : " + price);
	}
	

	public static void main(String[] args) {
		
		Laptop dell = new Laptop();
		Laptop Mac = new Laptop();
		
		dell.ram = 8;
		dell.price = 85000.00;
		
		Mac.ram = 4;
		Mac.price = 80000.00;
		
		dell.display();
		Mac.display();
		
	}

}
