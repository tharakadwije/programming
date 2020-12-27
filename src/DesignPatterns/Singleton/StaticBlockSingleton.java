package DesignPatterns.Singleton;

import java.io.File;

//Static block initialization implementation is similar to eager initialization,
// except that instance of class is created in the static block that provides option for exception handling.

//Both eager initialization and static block initialization creates the instance even before it’s being used and
//that is not the best practice to use.

public class StaticBlockSingleton {

    private StaticBlockSingleton() throws Exception{

        File.createTempFile(",","");

    }

    private static StaticBlockSingleton instance;

    static{
            try{
                instance = new StaticBlockSingleton();

            }catch (Exception ex){
                System.err.println("fails");
            }
    }


    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
