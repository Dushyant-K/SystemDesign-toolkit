package FactoryDesign;

public class LLD extends Course {

	@Override
	public void createCourse() {
		// TODO Auto-generated method stub
		modules.add(new IntroModule());
		modules.add(new ConceptModule());
		modules.add(new ExerciseModule());
	}

}
