package TestDome.DataStructure;

import TestDome.DataStructure.DynamicArray;
import TestDome.DataStructure.LinkListS;

public class MainMethod {

    public static void main(String[] args) {

        //DynamicArray
        DynamicArray array= new DynamicArray();

        array.add("1");
        array.add("2");
        array.add("3");
        array.add("4");
        array.add("5");
        array.add("6");
        array.add("7");

        System.out.println(array);

        System.out.println(array.get(1));

        System.out.println(array.getLastIndex());


        //LinkList
        LinkListS list = new LinkListS();

        list.add("Tharaka");
        list.add("Aki");
        list.add("Panchi");
        list.add("Test");
        list.add("Susila");

        list.display();
        list.delete("Test");
        list.display();


        //Stack
        Stack<String> stack = new Stack<String>(5);
        stack.push("SG");
        stack.push("NZ");
        stack.push("SL");
        stack.push("US");
        stack.push("AU");


        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        System.out.println(stack.pop());


    }
}
