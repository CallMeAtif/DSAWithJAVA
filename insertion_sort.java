package com.company;

import javax.swing.*;

public class insertion_sort {
    public static void printArray(int [] arr){
        for(int e: arr){
            System.out.println(e + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,-1,0,7,9,5};

        for(int LastUnsortedIndex = 1; LastUnsortedIndex < arr.length; LastUnsortedIndex++){
            int newElement = arr[LastUnsortedIndex];

            int i;

            for(i = LastUnsortedIndex; i > 0 && arr[i-1] > newElement; i--){
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }

        printArray(arr);
    }
}
