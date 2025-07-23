package singletonExample;

public class LoggerSingleton {
//How to make it thread safe
	private static volatile LoggerSingleton instance = null;//Volatile make the changes or the threads 
//	accessing this variable visible
	
	private LoggerSingleton() {
		if(instance!=null) {//Someone can still access it using reflection
			throw new RuntimeException("Please dont try to be smart");
		}
	}
	//Synchronized can be used at class-level or block-level
	public static LoggerSingleton getInstance() {
		if(instance==null) {
			synchronized(LoggerSingleton.class) {
				if(instance==null) {
					instance=new LoggerSingleton();
				}
			}
		}
		return instance;
	}
	
	
// Lazy-Loading
//		private static LoggerSingleton instance = null;
//	
//		private LoggerSingleton() {
//		}
//	
//		public static LoggerSingleton getInstance() {
//			if(instance==null) {
//				instance = new LoggerSingleton();
//			}
//			return instance;
//		}
		
	
//Eager-Loading
//	private static LoggerSingleton instance = new LoggerSingleton();
//	
//	private LoggerSingleton() {
//	}
//	
//	public static LoggerSingleton getInstance() {
//		return instance;
//	}
}
