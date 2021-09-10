package LeetCode;

import java.util.Arrays;

public class TwoSum {
    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //You can return the answer in any order.

       public static void main(String[] args) {
        int[] array = {3, 3};
        int target = 6; //нужно в массиве найти 2 числа, сумма которых будет равна таргету, вывести их индексы в массиве
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                if (sum == target) {
                    index1 = i;
                    index2 = j;
                    break;
                }
            }
        }

        if (index1 == index2) {
            System.out.println("Таких чисел нет");
        } else {

            int[] arrayResult = new int[2];
            arrayResult[0] = index1;
            arrayResult[1] = index2;
            System.out.println("Окончательный результат: " + Arrays.toString(arrayResult));
        }
                    }
}
