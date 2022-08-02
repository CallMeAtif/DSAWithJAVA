package com.company;

public class Main {

    public static void main(String[] args) {
	    Employee atifMulla = new Employee("Atif", "Mulla", 123);
        Employee parvezMulla = new Employee("Parvez" ,"Mulla",456);
        Employee armanBhakshey = new Employee("Arman" , "Bhakshey", 789);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(atifMulla);
        list.addToFront(parvezMulla);
        list.addToFront(armanBhakshey);

        list.printList();
    }
}
