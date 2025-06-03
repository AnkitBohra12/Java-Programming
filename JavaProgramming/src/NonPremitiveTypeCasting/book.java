package NonPremitiveTypeCasting;

public class book {
	
	String Book;
	int price;
	
	book(String Book, int price){ // constructor
		this.Book = Book;
		this.price = price;
	}
	
	public void write() { // method
		System.out.println("Writable");
	}
}
