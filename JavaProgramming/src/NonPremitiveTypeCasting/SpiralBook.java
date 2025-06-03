package NonPremitiveTypeCasting;

public class SpiralBook extends book{
	
	String Book;
	int price;
	private String string;
	
	SpiralBook(String Book, int price){
		super("XYZ",850);
		super.write();
		this.Book = Book;
		this.price = price;
	}
	
	public void Read() {
		System.out.println("Reading");
	}
	
	public static void main(String[] args) {
		SpiralBook sp = new SpiralBook("ABC", 520);
		sp.Read();
		System.out.println(sp.Book);
		System.out.println(sp.price);
		
	}
	

}
