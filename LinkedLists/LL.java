package com.company.LinkedLists;

public class LL {

    private Node head;
    private Node tail;

    private int size;
    LL(){
        this.size = 0;
    }


    // adding node to first
    public void addToFront(int value){

        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    //Adding node to last
    public void addToLast(int value){
        if(tail == null){
            addToFront(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size += 1;
    }


    //Getting size
    public int returnSize(){
        return size;
    }


    //Inserting Node on a particular Index
    public void insertNode(int index , int value){
        if(index == 0 ){
            addToFront(value);
            return;
        }
        if(index == size){
            addToLast(value);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;

    }

    //Deleting Node from the first
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }


    //Deleting Node from the Last

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = getIndex(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        size--;
        return val;
    }

    public int deleteFromIndex(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        Node prev = getIndex(index - 1);

        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    //Getting index value for deleteLast and deleteFromIndex function
    public Node getIndex(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    // Printing the List
    public void printList(){
        Node temp = head;
        System.out.print("HEAD -> ");
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }


    //Finding the node pointing to the given value
    public Node find(int val){
        Node node = head;
        while(node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }


    //Creating a node
    private class Node{
        private int value;
        private Node next; // -> reference to next node

        Node(int value){
            this.value = value;
        }
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
