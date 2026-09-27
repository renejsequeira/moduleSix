package moduleSix;

import java.util.Comparator;

class StudentRollno implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.toString().compareTo(o2.toString());
	}

	
}
