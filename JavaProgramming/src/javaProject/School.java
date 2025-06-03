package javaProject;

public class School {
	
	String ClassName;
	int NoOfStudents;
	String TeacherName;
	Playground p;
	
	
	School(String ClassName, int NoOfStudents, String TeacherName,Playground p){
		this(p);
		this.ClassName = ClassName;
		this.NoOfStudents = NoOfStudents;
		this.TeacherName = TeacherName;
	}
	
	public void study() {
		System.out.println("Students are studying");
	}
	
	public void teach() {
		System.out.println("Teachers are teaching the students");
	}
	
	School(Playground p){
		this.p = p;
		System.out.println("Playground used for " + p.prade + " on may "+ p.date);
		System.out.println("Playground is occupied for "+ p.SportsDay + " on may " + p.date);
	}

}
