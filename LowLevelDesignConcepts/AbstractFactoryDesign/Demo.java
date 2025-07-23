package AbstractFactoryDesign;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entranceFee=125;
		UniversityFactory abstractUniversityFactory= UniversityFactory.getUniversityFactory(entranceFee);
		
		AdmitCard admitCard = abstractUniversityFactory.getAdmitCard("Math");
		System.out.println(admitCard);
		FeeCalculator feeCalculator = abstractUniversityFactory.getFeeCalculator("Math");
		System.out.println(feeCalculator.getFees());
		
		AdmitCard admitCardTwo = abstractUniversityFactory.getAdmitCard("Physics");
		System.out.println(admitCardTwo);
	    feeCalculator = abstractUniversityFactory.getFeeCalculator("Physics");
		System.out.println(feeCalculator.getFees());
		
		AdmitCard admitCardThree = abstractUniversityFactory.getAdmitCard("CS");
		System.out.println(admitCardThree);
		feeCalculator = abstractUniversityFactory.getFeeCalculator("CS");
		System.out.println(feeCalculator.getFees());
		
		int entranceScore2=102;
		UniversityFactory abstractUniversityFactory2 = UniversityFactory.getUniversityFactory(entranceScore2);
		
		AdmitCard admitCard2=abstractUniversityFactory2.getAdmitCard("Math");
		System.out.println(admitCard2.getClass());
		FeeCalculator feeCalculator2 = abstractUniversityFactory2.getFeeCalculator("Math");
		System.out.println(feeCalculator2.getFees());
	}

}
