package com.company.Sort_Algorithms;

public class insertion_sort_recursive {
    public static void insertion_recur(int [] arr, int numItems){
        if(numItems < 2)
            return;

        insertion_recur(arr,numItems - 1);

        int newElement = arr[numItems - 1];

        int i;

        for(i = numItems - 1; i > 0 && arr[i - 1] > newElement; i--){
            arr[i] = arr[i - 1];
        }
        arr[i] = newElement;
    }
    public static void main(String[] args) {
        int [] arr = {23,-2,3,-22,9,-1,0};

        insertion_recur(arr, arr.length);

        for(int e: arr){
            System.out.println(e);
        }
    }
}
