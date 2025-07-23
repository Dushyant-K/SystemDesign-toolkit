package adpaterDesign;

import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClient studentClient = new StudentClient();
		List<Student> studentList = studentClient.getStudentList();
		System.out.println(studentList);
	}

}
