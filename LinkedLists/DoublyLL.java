package LinkedLists;

import java.util.NoSuchElementException;

public class DoublyLL {

    private Node head;
    private int size;

    public DoublyLL(){
        this.size = 0;
    }

    // Adding in first
    public void addToFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }


    //Printing List
    public void printList(){
        Node current = head;

        System.out.print("HEAD -> ");
        while(current != null){
            System.out.print(current.value + " <=> ");
            current = current.next;
        }
        System.out.println("END");
    }


    //Printing List in reverse
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

    //Inserting in last
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

        size++;
    }

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
    //Inserting after a given node value
    public void insert(int after,int value){

        Node p = find(after);
        if(p == null){
            System.out.println("Value doesn't exists");
            return;
        }

        Node node = new Node(value);

        node.next = p.next;
        node.prev = p;
        p.next = node;
        if(node.next != null){
            node.next.prev = node;
        }

        size++;
    }

    public void addBefore(int value,int before){
        if(head == null){
            System.out.println("The list was Empty so added the node as new Node");
            addToFirst(value);
        }
        Node current = head;
        Node p = null;
        while(current.value != before){
            p = current;
            current = current.next;
        }

        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        node.next.prev = node;
        size++;
    }

    // Deleting element from first
    public int deleteFirst(){

        int val = head.value;
        head = head.next;
        head.prev = null;

//        if(head == null){
//            tail = head;
//        }

        size--;
        return val;

    }

    //Deleting element from the last
    public int deleteLast(){
        if(head == null){
            throw new NoSuchElementException();
        }

        Node secondLast = getIndex(size - 2);

        int value = secondLast.next.value;
        secondLast.next = null;

        size--;

        return value;

    }

    // Deleting element from a given index
    public int deleteFromIndex(int index){
        if(size == 0){
            deleteFirst();
        }
        else if(size == index){
            deleteLast();
        }

        Node toRemove = getIndex(index - 1);

        int val = toRemove.next.value;

        toRemove.next = toRemove.next.next;
        toRemove.next.prev = toRemove;

        size--;
        return val;

    }


    public Node getIndex(int index){
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
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
