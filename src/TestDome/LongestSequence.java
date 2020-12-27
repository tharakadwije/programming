package TestDome;

import java.util.ArrayList;

//Find Longest Sequence of 1's
public class LongestSequence {

    public static void main(String arg[]){
        ArrayList list = new ArrayList();
        Integer maxSize =0;
        Integer sequence = 0;
        int array[] = {1,1,0,1,1,0,1,0,1,1};

        for(int i =0; i<array.length; i++){
           if(array[i]==1){
               sequence++;
               if(array.length-1 == i){
                   list.add(sequence);
               }
           }else{
               list.add(sequence);
               list.add(0);
               sequence =0;
           }
        }

        for(int i=0 ; i<list.size(); i=i+2){

            int len = (int) list.get(i);
            if( (i+1) < list.size())
                len += (Integer) list.get(i+1);

            if( (i+2) < list.size())
                len += (Integer) list.get(i+2);

            if(len>maxSize){
                maxSize=len;
            }

        }

        System.out.println(maxSize);
    }

}
