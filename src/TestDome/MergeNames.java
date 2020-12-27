package TestDome;

import java.util.Arrays;
import java.util.LinkedHashSet;

//Merge the two arrays and eliminate the duplicates
public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");

        LinkedHashSet names = new LinkedHashSet();

        for (String name : names1){
            names.add(name);
        }

        for (String name : names2){
            names.add(name);
        }

        System.out.println(names);
        return Arrays.copyOf(names.toArray(),names.size(),String[].class);
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Tharaka", "Aki", "Panchi"};
        String[] names2 = new String[] {"Panchi", "Test", "Aki"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}