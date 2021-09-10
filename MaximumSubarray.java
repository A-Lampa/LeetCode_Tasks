package LeetCode;

//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        int maxSum = nums[0];

        for (int a = 1; a < nums.length; a++) {
            if (nums[a] > maxSum){
                maxSum = nums[a];
            }
        }
        //System.out.println("Сумма в самом начале: " + maxSum);
            int sum = 0;
            int minus = 1;

            if (nums.length > minus) {

                while (minus < nums.length) {

                    for (int i = 0; i < nums.length - minus; i++) {
                        sum = nums[i];
                        //System.out.println("Начинаем отсчет с: " + sum);
                        for (int j = i + 1; j < nums.length - minus + 1; j++) {
                            sum = sum + nums[j];
                            //System.out.println("Сумма за проход: " + sum);
                        }
                        if (sum > maxSum) {
                            maxSum = sum;
                            //System.out.println("Максимальная сумма на данный момент: " + maxSum);
                        }
                    }
                    //System.out.println("Окончательная максимальная сумма: " + maxSum);
                    minus = minus + 1;
                }
                System.out.println("Окончательная максимальная сумма: " + maxSum);
            } else if (nums.length == minus) {
                maxSum = nums[0];
                System.out.println("Окончательная максимальная сумма: " + maxSum);
            }
        }
    }

