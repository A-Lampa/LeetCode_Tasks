package LeetCode;

//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
//Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
//Return k after placing the final result in the first k slots of nums.

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int index = 0;


        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    swap(nums, i, j);
                }
            }
        }

        System.out.println("Массив после первой сортировки: " + Arrays.toString(nums)); //просто отсортировали массив

        boolean needSort = true;

        while (needSort) {
            needSort = false;
            for (int k = 0; k < nums.length - 1; k++) {
                for (int l = k + 1; l < nums.length - 1; l++) {
                    if (nums[k] == nums[l]) {
                        swap(nums, l, l + 1);
                    }
                }
            }
            System.out.println("Промежуточный шаг: " + Arrays.toString(nums)); //просто отсортировали массив

            for (int m = 0; m < nums.length - 1; m++){
                if (nums[m] == nums[m+1]){
                    needSort = true;
                }
            }
        }
        System.out.println("Массив после второй сортировки: " + Arrays.toString(nums));

        for (int c = 0; c < nums.length - 1; c++){
            if (nums[c] > nums[c+1]){
            index = c+1;
            break;
            }
        }
        System.out.println(index + ", nums = " + Arrays.toString(nums));
    }

    public static void swap (int[]array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
