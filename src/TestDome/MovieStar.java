package TestDome;

import java.util.Collections;
import java.util.PriorityQueue;

public class MovieStar {

    public static void main(String[] args) {

        int movieArray [] = {4,2,3,5,1,3,2,4,3,4,5,2,3};

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        int k =2;

        for(int i : movieArray){
            pq.add(i);

            if(pq.size()>k){
                pq.poll();
            }
        }

        System.out.println(pq.toString());
    }
}
