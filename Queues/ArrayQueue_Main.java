package Queues;

public class ArrayQueue_Main {
    public static void main(String[] args) {
        Employee atifmulla = new Employee("Atif", "mulla", 123);
        Employee parvezmulla = new Employee("Parvez", "Mulla", 456);
        Employee armanBhakshey = new Employee("Arman","Bhakshey",789);
        Employee armanBhakshey1 = new Employee("Arman","Bhakshey",789);



        ArrayQueue queue = new ArrayQueue(3);
        queue.add(atifmulla);
        queue.add(parvezmulla);
        queue.add(armanBhakshey);

        queue.printQueue();

    }
}
