package headfirst.singleton.threadsafe;

public class LazySingleton {
	private static LazySingleton uniqueInstance;
 
	// other useful instance variables here
 
	private LazySingleton() {}
 
	public static synchronized LazySingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new LazySingleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
}
