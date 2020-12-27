package TestDome;

import java.util.ArrayList;
import java.util.Stack;

public class StaircaseDemo {

    public static void main(String[] args) {
        int step = 4;

        Stack<Stair> stairStack = new Stack<Stair>();
        stairStack.add(new Stair(0, new ArrayList<Integer>()));

        while(!stairStack.isEmpty()){
            Stair currentStair = stairStack.pop();

            if(currentStair.number == step){
                System.out.println(currentStair.visited);
                continue;
            }else{
                int oneStair = currentStair.number + 1;
                if(oneStair <= step){
                    stairStack.add(new Stair(oneStair,currentStair.visited));
                }

                int twoStair = currentStair.number + 2;
                if(twoStair <= step){
                    stairStack.add(new Stair(twoStair,currentStair.visited));
                }
            }
        }
    }



    static class Stair{

        public int number;
        public ArrayList<Integer> visited = new ArrayList<Integer>();

        public Stair(int number, ArrayList<Integer> visited) {
            this.number = number;
            this.visited.addAll(visited);
            this.visited.add(this.number);
        }
    }
}
