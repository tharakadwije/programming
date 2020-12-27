package DesignPatterns.Singleton;


// It reduces the performance because of the cost associated with the synchronized method,
// although we need it only for the first few threads who might create the separate instances.
// To avoid this extra overhead every time, double checked locking principle is used. In this approach,
// the synchronized block is used inside the if condition with an additional check to ensure that only one instance of
// a singleton class is created.

public class DoubleCheckingSingleton {

    private static DoubleCheckingSingleton instance;

    private DoubleCheckingSingleton(){

    }

    public DoubleCheckingSingleton getInstance(){

        if(instance == null){
            synchronized (DoubleCheckingSingleton.instance) {
                if (instance == null) {
                    instance = new DoubleCheckingSingleton();
                }
            }
        }

        return instance;
    }
}
