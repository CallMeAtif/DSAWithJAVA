package com.company.LinkedLists;

public class DoublyLL {

    private Node head;
    private Node tail;

    public void addToFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void printList(){
        Node current = head;

        while(current != null){
            System.out.print(current.value + " <=> ");
            current = current.next;
        }
        System.out.println("Null");
    }


    public void printListInReverse(){
        Node current = head;
        Node last = null;
        while(current != null){
            System.out.print(current.value + " -> ");
            last = current;
            current = current.next;
        }
        System.out.println("END");

        //printing in reverse

        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.print("START");
    }

    public void InsertLast(int value){

        Node node = new Node(value);
        Node last = head;

        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }

    private class Node{

        private int value;
        private Node next;
        private Node prev;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
