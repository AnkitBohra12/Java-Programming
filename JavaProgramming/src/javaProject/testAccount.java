package javaProject;

public class testAccount {

	public static void main(String[] args) {
		
		Account a = new Account();
		a.setaccountHolderName("Amit");
		a.setpinNo(2002);
		System.out.println(a.getaccountHolderName());
		System.out.println(a.getaccountNo());
		System.out.println(a.getpinNo());
	}

}
