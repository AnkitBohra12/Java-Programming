package javaProject;

public class print {
	String a,b,c;
	
	print(String a){
		this.a = a;
		System.out.println(a);
	}
	
	print(String a, String b){
		this(a);
		this.b = b;
		System.out.println(b);
	}
	
	print(String a , String b, String c){	
		this(a,b);
		this.c = c;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		print p = new print("java"," is a ","programming language");
		

	}

}
