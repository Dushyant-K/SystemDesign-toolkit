package adpaterDesign;

public class collegeStudent implements Student {
	
	String name;
	String surName;
	String email;
	
	
	public collegeStudent(String name, String surName, String email) {
		this.name=name;
		this.surName=surName;
		this.email=email;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getsurName() {
		// TODO Auto-generated method stub
		return surName;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

}
