package com.company.Arrays;

import java.util.Arrays;

public class A1_ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2};
        System.out.println(Arrays.toString(arr));
        reverseAnArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseAnArray(int[] arr){
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
}
