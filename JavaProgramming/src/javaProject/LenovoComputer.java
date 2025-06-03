package javaProject;

public class LenovoComputer extends Computer{
	
	String chip;
	
	LenovoComputer(String chip){ 
		//Implicit super constructor Computer() is undefined.Must explicitly invoke another constructor
		super(6);
		this.chip = chip;
	}

}
