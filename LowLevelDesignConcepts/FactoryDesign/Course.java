package FactoryDesign;
import java.util.*;

public abstract class Course {
	protected List<Module> modules = new ArrayList<>();
	
	public Course() {
		this.createCourse();
	}
	
	public List<Module> getModules(){
		return modules;
	}
	public abstract void createCourse();
}
