package com.company.Arrays;

import java.util.Arrays;

public class A1_ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2};
        System.out.println(Arrays.toString(arr));
        //reverseAnArrayApproach1(arr);
        reverseAnArrayApproach2(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //Using Loop O(n)
    private static void reverseAnArrayApproach1(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while (i < j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }

    //Using Recursive O(n)
    private static void reverseAnArrayApproach2(int[] arr, int i, int j){
        if (i < j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            reverseAnArrayApproach2(arr, i+1, j-1);
        }
    }
}