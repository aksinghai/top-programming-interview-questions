package com.company.Arrays;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8};
        List<Integer> list = new ArrayList<>();
        list.contains(1);



       int k = 70;
        System.out.println(binarySearch(arr, k, 0, 7));
    }

    private static int binarySearch(int[] arr, int k, int l, int r){
        if(r >= l){
            int m = l + ((r - l) / 2 );
            if(arr[m] == k){
                return m;
            } else if (arr[m] > k) { //Left
                return binarySearch(arr, k, l, m-1);
            } else {
                return binarySearch(arr, k, m+1, r);
            }
        } else {
            return -1;
        }
    }
}