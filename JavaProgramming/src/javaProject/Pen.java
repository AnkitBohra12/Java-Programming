package javaProject;

public class Pen{
		
		 int price;
		 String brand, colour;
		 
		 Pen(String brand, String colour, int price){				
			 this.brand = brand;
			 this.colour = colour;
			 this.price = price;
		 }
		
		 void display(){
			System.out.println("Brand of pen is : " + brand);
			System.out.println("Price of pen is  : " + price);
			System.out.println("Colour of pen is : " + colour);
		}
		

		public static void main(String[] args) {
			
			Pen p = new Pen("dot","white",20);
			Pen p1 = new Pen("gel","black",20);
			
			p.display();
			p1.display();
			
		}

}
