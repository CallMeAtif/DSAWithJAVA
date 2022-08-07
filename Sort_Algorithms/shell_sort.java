package com.company.Sort_Algorithms;

public class shell_sort {
    public static void printArray(int [] arr){
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        int [] arr = {2,-1,0,7,9,5,4};

        for(int gap = arr.length / 2; gap > 0; gap /= 2){

            for(int i = gap; i < arr.length; i++){
                int newElement = arr[i];

                int j = i;

                while(j >= gap && arr[j - gap] > newElement ){
                    arr[j] = arr[j-gap];
                    j-=gap;
                }
                arr[j] = newElement;

            }
        }
        printArray(arr);
    }
}
