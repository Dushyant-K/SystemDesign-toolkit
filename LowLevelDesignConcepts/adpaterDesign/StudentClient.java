package adpaterDesign;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		
		collegeStudent collegeStudent = new collegeStudent("Dushyant","Verma","dushyantverma.cs11@gmail.com");
		
		schoolStudent schoolStudent = new schoolStudent("Rajan","Sharma","rajansharma01@gmail.com");
		
		students.add(collegeStudent);
		students.add(new SchoolStudentAdapter(schoolStudent));
		return students;
	}

}
