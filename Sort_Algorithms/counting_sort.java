package com.company.Sort_Algorithms;

public class counting_sort {
    public static void countingSort(int[] arr, int min, int max){
        int [] countArray = new int[(max - min) + 1];

        for(int i = 0; i < arr.length;i++){
            countArray[arr[i] - min]++;
        }

        int j = 0;
        for(int i = min; i <= max; i++){
            while(countArray[i - min] > 0){
                arr[j++] = i;
                countArray[i - min]--;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {2,5,9,8,2,8,7,10,4,3};

        countingSort(arr,1,10);

        for(int e: arr){
            System.out.println(e);
        }
    }
}
