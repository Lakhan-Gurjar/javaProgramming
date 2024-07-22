package com.leetcodevideo15and16;

public class ceilingofaNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 20;
        System.out.println(ceiling(arr, target));
    }

    // return the index of smallest number >= target
    static int ceiling(int[] arr, int target) {

        //but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
        int mid = start + (end - start)/2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
