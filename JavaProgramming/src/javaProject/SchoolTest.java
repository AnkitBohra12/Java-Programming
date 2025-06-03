package javaProject;

public class SchoolTest {

	public static void main(String[] args) {
		
		Playground pg = new Playground("Football","Republic Day",26);
		School s = new School("Tenth",50,"Arijit Singh",pg);
		s.study();
		s.teach();
		
		
		
		
	}

}
