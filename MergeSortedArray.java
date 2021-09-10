package LeetCode;

//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
// To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
// and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        int[] resultArray = new int[m + n];

        if (m > 0) {
            for (int i = 0; i < m; i++) {
                resultArray[i] = nums1[i];
            }
        }

        if (n > 0){
            int indexNums2 = 0;
            for (int j = m; j < resultArray.length; j++){
                resultArray[j] = nums2[indexNums2];
                indexNums2 = indexNums2 + 1;
            }
        }
        System.out.println("Соединенные массивы до сортировки: " + Arrays.toString(resultArray));

        for (int e = 0; e < resultArray.length - 1; e++){
            if (resultArray[e] > resultArray[e+1]){
                swap (resultArray, e, e+1);
            }
        }
        System.out.println("Массив после сортировки: " + Arrays.toString(resultArray));
    }

    public static void swap (int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
