package javaProject;

public class HarshadNumber {	
//	12 = 1+2 = 3 // devided by 12/3
	
	public static boolean number(int n) {
		
		int sum = 0,n1 = n;
		
		while(n>0) {
			sum = sum + n%10;
			n=n/10;
		}
		if(n1%sum == 0)
			return true;
		else
			return false;	
	}
	
	public static void HarshadNumber() {
		
		for(int i=1; i<=100; i++) {
			if(number(i)) {
				System.out.println(i);
			}
		}		
	}
	
	public static void main(String[] args) {
		
		System.out.println(HarshadNumber.number(12));
		HarshadNumber.HarshadNumber();
	}

}
