package DesignPatterns.Singleton;

import org.junit.Assert;

public class SingletonMain {

    public static void main(String[] args) {
        BasicEagerSingleton basicSingleton = BasicEagerSingleton.getInstance();

        BasicEagerSingleton basicSingleton2 = BasicEagerSingleton.getInstance();

        System.out.println(basicSingleton);
        System.out.println(basicSingleton2);

        basicSingleton.setNumber(2);

        System.out.println(basicSingleton.getNumber());
        System.out.println(basicSingleton2.getNumber());

        basicSingleton2.setNumber(4);

        System.out.println(basicSingleton.getNumber());
        System.out.println(basicSingleton2.getNumber());
    }



    //@Test
    public void testMethod(){
        BasicEagerSingleton basicSingleton = BasicEagerSingleton.getInstance();

        BasicEagerSingleton basicSingleton2 = BasicEagerSingleton.getInstance();

        Assert.assertEquals(basicSingleton,basicSingleton2);
        System.out.println(basicSingleton);
        System.out.println(basicSingleton2);
        System.out.println(basicSingleton.equals(basicSingleton2));

    }
}
