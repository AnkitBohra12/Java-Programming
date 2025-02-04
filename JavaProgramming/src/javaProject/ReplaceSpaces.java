package javaProject;

public class ReplaceSpaces {

	public static void main(String[] args) {
		
		
		String space = "This is : the : Java";
		System.out.println(space);
		
		String withoutSpace = space.replaceAll("\\s","");
		System.out.println(withoutSpace);
		
		String withoutcoln = withoutSpace.replace(":", "");
		System.out.println(withoutcoln);
		
		System.out.println();
		
		String sp_coln = space.replaceAll("\\s","").replace(":","");
		System.out.println(sp_coln);
		
		
		
	}

}
