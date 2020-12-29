package DesignPatterns.Singleton;

// This approach actually avoids the problem of syschronization so it guarantees effectively
// that whenever you initialize the instance you re only going to get one instance whatever happens.

public class InnerStaticSingleton {

    private InnerStaticSingleton(){

    }

    private static class Impl{
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();

    }

    public InnerStaticSingleton getInstance(){
        return Impl.INSTANCE;
    }

}
