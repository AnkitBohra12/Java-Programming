package javaProject;

public class CarTest {

	public static void main(String[] args) {
		
		Engine e = new Engine(500,"silver");
		Car c = new Car("TATA","Green", e);
		
		System.out.println(c.company);
		System.out.println(c.colour);
		System.out.println(c.e.weight);
	}

}
