package moduleSix;


public class Student {
	int rollno;
	String name;
	String address;
	
	Student(int r, String n, String a){
		rollno = r;
		name = n;
		address = a;
	}
	
	String getName() {
		return name;
	}
	
	int getRollno() {
		return rollno;
	}
	
	public String toString() {
		return Integer.toString(rollno);
		
	}

}
