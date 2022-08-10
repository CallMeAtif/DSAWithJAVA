package com.company.LinkedLists;

public class CircularLL {
    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    //adding
    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    //Printing
    public void printList(){
        Node current = head;
        if(head != null){
            do {
                System.out.print(current.value + " -> ");
                current = current.next;
            }while(current != head);
        }
        System.out.print("HEAD");


    }

    //deleting

    public void delete(int value){
        Node node = head;

        if(node == null){
            return;
        }

        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }


    private class Node{

        private int value;
        private Node next;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
