package com.company.LinkedLists;

public class DoublyLL_Main {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.addToFirst(5);
        list.addToFirst(4);
        list.addToFirst(3);
        list.addToFirst(2);
        list.addToFirst(1);

//        list.printList();
//        list.printListInReverse();
//        list.InsertLast(6);
        list.InsertLast(4);
        list.printList();
    }
}
