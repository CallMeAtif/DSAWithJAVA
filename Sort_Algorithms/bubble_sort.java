package com.company.Sort_Algorithms;
import java.util.*;

public class bubble_sort {
    public static void main(String[] args) {
        int [] arr = {2,-2,53,62,-51,0,8};

        for(int i = 0; i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
