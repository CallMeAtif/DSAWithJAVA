package com.company;

public class quick_sort {
    public static void quickSort(int [] arr ,int start, int end){
        if(end - start < 2){
            return;
        }

        int pivotIndex = partition(arr,start,end);
        quickSort(arr,start,pivotIndex);
        quickSort(arr,pivotIndex + 1,end);
    }

    public static int partition(int[]arr, int start,int end){
        // using first element as the pivot
        int pivot = arr[start];
        int i = start;
        int j = end;

        while(i < j){

            while(i < j){

                // empty body
                while(i < j && arr[--j] >= pivot);
                if(i < j){
                    arr[i] = arr[j];
                }

                // empty body
                while(i < j && arr[++i] <= pivot);
                if(i < j){
                    arr[j] = arr[i];
                }
            }
        }
        arr[j] = pivot;
        return j;
    }
    public static void main(String[] args) {
        int [] arr = {2,0,-1,5,-3,9,7,-4,-6};

        quickSort(arr,0,arr.length);

        for(int e: arr){
            System.out.println(e);
        }
    }
}
