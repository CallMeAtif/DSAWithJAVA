package com.company.Stack;

public class ArrayStack_Main {
    public static void main(String[] args) {
        Employee atifmulla = new Employee("Atif" ,"Mulla", 123);
        Employee parvezmulla = new Employee("Parvez", "Mulla", 456);
        Employee armanbhakshey = new Employee("Arman", "Bhakshey",789);
        ArrayStack stack = new ArrayStack(2);

        stack.push(atifmulla);
        stack.push(parvezmulla);
        stack.push(armanbhakshey);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
        stack.printstack();

//        System.out.println(stack.size());
    }
}
