package singletonExample;

public class singletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoggerSingleton singletonObj = LoggerSingleton.getInstance();
		
		System.out.println(singletonObj);
		
		LoggerSingleton singletonObj2 = LoggerSingleton.getInstance();
		
		System.out.println(singletonObj2);
	}

}
