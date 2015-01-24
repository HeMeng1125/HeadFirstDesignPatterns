package headfirst.singleton.threadsafe;

public class LazyInitHolderSingleton {
    private LazyInitHolderSingleton() {}
    
    //私有内部类，持有一个静态常量成员
    private static class SingletonHolder {
        private static final LazyInitHolderSingleton INSTANCE = 
            new LazyInitHolderSingleton();
    }
    
    public static LazyInitHolderSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}