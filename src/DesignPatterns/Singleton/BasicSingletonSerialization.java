package DesignPatterns.Singleton;

import java.io.*;

//1. Reflection ; It is also possible to instantiate new objects, invoke methods and get/set field values using reflection
//2. Serialization ; There is a way in which you can make additional copies of the singleton
// and so breaking the whole singleton contract without even figuring out
// that you are actually doing it. and this can be done for example through serialization.

//	a.	If the class of the object is not an enum type and defines the appropriate readResolve method,
//	the method is called to allow the object to replace itself.
// 	b.	Then if previously enabled by enableResolveObject, the resolveObject method is called to allow subclasses
// 	of the stream to examine and replace the object. If the previous step did replace the original object,
// 	the resolveObject method is called with the replacement object.
// 	If a replacement took place, the table of known objects is updated so the replacement object is associated with the handle.
// 	The replacement object is then returned from readObject.


public class BasicSingletonSerialization implements Serializable {

    private static final BasicSingletonSerialization INSTANCE =  new BasicSingletonSerialization();

    private BasicSingletonSerialization(){

    }

    public static BasicSingletonSerialization getInstance(){
        return INSTANCE;
    }

    private int number=0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    protected Object readResolve(){
        return INSTANCE;
    }

    public static void saveToFile(BasicSingletonSerialization singleton, String fileName) throws Exception{

        try(FileOutputStream fileIo = new FileOutputStream(fileName);
            ObjectOutputStream objectIO = new ObjectOutputStream(fileIo)){

            objectIO.writeObject(singleton);
        }

    }

    public static BasicSingletonSerialization readFromFile(String fileName) throws Exception{

        try(FileInputStream fileI0 = new FileInputStream(fileName);
            ObjectInputStream obIO = new ObjectInputStream(fileI0)){

            return (BasicSingletonSerialization) obIO.readObject();
        }
    }

    public static void main(String[] args) throws Exception{

         BasicSingletonSerialization instance1 = BasicSingletonSerialization.getInstance();
         instance1.setNumber(111);

         String fileName = "E:/singletonFileName.txt";
         saveToFile(instance1,fileName);

         instance1.setNumber(333);

         BasicSingletonSerialization instance2 = readFromFile(fileName);

         System.out.println(instance1 == instance2);

         System.out.println(instance1.getNumber()+"");
         System.out.println(instance2.getNumber()+"");


    }
}
