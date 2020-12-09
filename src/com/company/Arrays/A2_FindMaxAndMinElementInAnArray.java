package com.company.Arrays;

public class A2_FindMaxAndMinElementInAnArray {

    public static void main(String[] args) {
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        findMinMax(arr);
    }

    //O(n)
    private static void findMinMax(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Min: "+min+" Max: "+max);
    }
}
