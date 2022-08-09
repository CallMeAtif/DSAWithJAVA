package com.company.LinkedLists;

public class LL_using_Numbers_Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.addToFront(6);
        list.addToFront(5);
        list.addToFront(4);
        list.addToFront(3);
        list.addToFront(2);
        list.addToFront(1);
        list.addToLast(7);

//        list.insertNode(2,67);
//        list.printList();
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        list.printList();
        System.out.println(list.deleteFromIndex(2));
        list.printList();
//        System.out.println(list.returnSize());


    }
}
