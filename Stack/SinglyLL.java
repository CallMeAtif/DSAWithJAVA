package Stack;

import java.util.EmptyStackException;

public class SinglyLL {

    private Node head;
    private int top;

    SinglyLL(){
        this.top = 0;
    }

    public void push(Employee employee){
        Node node = new Node(employee);
        node.next = head;
        head = node;
        top += 1;
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = head.employee;
        head = head.next;
        return employee;
    }

    public Employee peek(){
        return head.employee;
    }

    public void printLL(){
        Node current = head;
        System.out.print("Head -> ");
        while(current != null){
            System.out.print(current.employee + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public boolean isEmpty(){
        return top == 0;
    }

    private class Node{
        private Employee employee;
        private Node next;


        public Node(Employee employee) {
            this.employee = employee;
        }

        public Node(Employee employee, Node next) {
            this.employee = employee;
            this.next = next;
        }
    }
}
