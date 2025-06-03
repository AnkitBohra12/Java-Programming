package javaProject;

public class B extends A{
	
	int i = 100;
	
	void m2() {
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
		System.out.println(b.a);

	}

}
