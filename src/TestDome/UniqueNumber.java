package TestDome;

import java.util.ArrayList;
import java.util.HashMap;

//Find the unique numbers from the array list
public class UniqueNumber {

    public static void main(String[] args) {

        int array [] = {1,3,5,5,6,6,7,8,10,10};

        HashMap<Integer,Integer> uniqueMap = new HashMap<>();

        for(int i=0; i<array.length; i++){

            if(uniqueMap.containsKey(array[i])){
                int value = uniqueMap.get(array[i]);
                uniqueMap.put(array[i],++value);
            }else{
                uniqueMap.put(array[i],1);
            }
        }
        ArrayList<Integer> newlist= new ArrayList<Integer>();

        uniqueMap.forEach((k,v) -> {
            if(v==1){
                newlist.add(k);
            }
        });


            System.out.println(newlist);
    }
}

