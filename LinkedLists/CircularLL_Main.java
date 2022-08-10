package com.company.LinkedLists;

public class CircularLL_Main {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();

        list.insert(3);
        list.insert(9);
        list.insert(4);
        list.insert(10);
        list.delete(9);
        list.printList();
    }
}
