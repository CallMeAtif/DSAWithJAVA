package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class InbuiltQueue {
    public static void main(String[] args) {
        Queue<Employee> queue = new LinkedList<>();

        Employee atifmulla = new Employee("Atif", "mulla", 123);
        Employee parvezmulla = new Employee("Parvez", "Mulla", 456);
        Employee armanBhakshey = new Employee("Arman","Bhakshey",789);

        queue.add(atifmulla);
        queue.add(parvezmulla);
        queue.add(armanBhakshey);

//        System.out.println(queue.peek());

//        System.out.println(queue.remove());
        
//        System.out.println(queue.peek());

        queue.forEach(employee -> System.out.println(employee));
    }
}
