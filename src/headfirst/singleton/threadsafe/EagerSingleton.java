package headfirst.singleton.threadsafe;

public class EagerSingleton {
	// jvm保证在任何线程访问uniqueInstance静态变量之前一定先创建了此实例  
    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton() {}  
  
          
    public static EagerSingleton getInstance() {  
        return uniqueInstance;  
    }  
}