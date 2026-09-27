package moduleSix;
import java.util.*;
public class StudentInfo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int rollno;
		String name;
		String address;
		List <Student> student = new ArrayList<>();
		
		for(int i = 0; i < 3 ; i++) {
			System.out.println("Enter student rollno, name, and address: ");
			rollno = keyboard.nextInt();
			keyboard.nextLine();
			name = keyboard.nextLine();
			address = keyboard.nextLine();
			Student newStudent = new Student(rollno,name,address);
			student.add(newStudent);
			/*
			for(Student n:student) {
				System.out.println(n.toString());
			}*/
		}
		
		keyboard.close();
		StudentName nameCompare = new StudentName();
		student.sort(nameCompare);
		for(Student n:student) {
			System.out.println(n.getName());
		}

		StudentRollno rollnoCompare = new StudentRollno();
		student.sort(rollnoCompare);
		for(Student n:student) {
			System.out.println(n.toString());
		}
	}

	
}
