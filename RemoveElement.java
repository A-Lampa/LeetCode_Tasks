package LeetCode;
//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
//Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
//Return k after placing the final result in the first k slots of nums.

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
      int[] nums = {0,1,2,2,3,0,4,2};
      int val = 2;
      int index = nums.length - 1;
      int amountOfVal = 0;
      int output = 0;

      for (int v = 0; v < nums.length; v++){
          if (nums[v] == val)
              amountOfVal = amountOfVal + 1;
      }
        //System.out.println("Количество цифр, которые нужно убрать: "+ amountOfVal);

      for (int j = nums.length - 1; j >= 0; j--){
          if (nums[j] == val){
              index = j-1;
          }  else {
              break;
          }
      }

        //System.out.println("Значение индекса: " + index);


      for (int i = 0; i < nums.length; i++){
          if (nums[i] == val) {
              swap(nums, i, index);
              index = index - 1;
          }
          //System.out.println("Промежуточное: " + Arrays.toString(nums));
          //System.out.println("Значение i: " + i);

          if (amountOfVal > 1 && nums[nums.length-amountOfVal] == val){
              break;
          } else if (amountOfVal == 1 && nums[nums.length-1] == val){
              break;
          }
      }

      for (int k = 0; k < nums.length; k++){
          if (nums[k] == val){
              break;
          } else
              output = output + 1;
      }
        System.out.println("Массив после сортировки: " + Arrays.toString(nums));
        System.out.println("Output: " + output);
    }

    public static void swap (int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
