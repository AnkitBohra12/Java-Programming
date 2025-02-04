package javaProject;

public class SentenceIntoWords {

	public static void main(String[] args) {
		
		String s = "we can go anywhere downtown to the coast";
		String s1 = "";
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if (!Character.isWhitespace(ch)) {
				s1+=ch;
			}
		}
		System.out.println(s1);
		
		String str = "to				the 			we ";
		
		String st = str.replaceAll(" ","");	// ReplaceAll can remove all spaces and tab spaces
		System.out.println(st);
		
		String str1 = "       Geeks				     for Geeks     ";// replace can't remove the tabular spaces
        String op = str1.replace(" ","");
       
        System.out.println(op);
		
		
	}
	
	
}

