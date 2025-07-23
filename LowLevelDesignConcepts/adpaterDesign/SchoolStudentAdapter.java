package adpaterDesign;

public class SchoolStudentAdapter implements Student {
	
	schoolStudent schoolStudent;
	
	public SchoolStudentAdapter(schoolStudent schoolStudent) {
		this.schoolStudent=schoolStudent;
		}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.schoolStudent.getName();
	}

	@Override
	public String getsurName() {
		// TODO Auto-generated method stub
		return this.schoolStudent.getSurName();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return this.schoolStudent.getEmail();
	}
	
}
