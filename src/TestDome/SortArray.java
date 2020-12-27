package TestDome;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Tharaka");
        names.add("Panchani");
        names.add("Aki");
        names.add("Susila");
        names.add("Wije");
        names.add("Tharindu");
        names.add("Sayul");


        for (String name : names){
            System.out.println(name);
        }

        System.out.println("---");
        Collections.sort(names);


        for (String name : names){
            System.out.println(name);
        }
    }
}
