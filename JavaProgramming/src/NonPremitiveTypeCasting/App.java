package NonPremitiveTypeCasting;

public class App {
	
	public static void main(String[] args) {
		
		Spinach s = new Spinach();
		
		Vegetable v = s; // upcasting 
		v.getMinerals();
//		v.getGoodHealth();   CTE
		
		Spinach sp = (Spinach) v; // Downcasting
		sp.getGoodHealth();
		sp.getMinerals();
		
		Potato p = (Potato)v;
		
	}

}
