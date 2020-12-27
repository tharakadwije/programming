package TestDome.DataStructure;

import java.util.PriorityQueue;

public class PriorityQueueStudent {

    public static void main(String[] args) {

        PriorityQueue<Student> pqStudent = new PriorityQueue<Student>();

        pqStudent.add(new Student("Tharaka", 29));
        pqStudent.add(new Student("Aki", 2));
        pqStudent.add(new Student("Panchi", 27));
        pqStudent.add(new Student("Tharaka", 2));

        for (Student name : pqStudent){
            System.out.println(name.getName() +" - " + name.getAge());
        }

    }


}
