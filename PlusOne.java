package LeetCode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

    //You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
    // The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
    //Increment the large integer by one and return the resulting array of digits.

    public static void main(String[] args) {
        int [] array = {4,3,2,1};
        long result = 0;
        System.out.println("Исходный массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            result = result * 10 + array[i];
            }

        long futureArray = result + 1;
        String stringFuture = Long.toString(futureArray);
        char[] charArray = stringFuture.toCharArray();

        int [] arrayInt = new int [charArray.length];
        for (int j=0; j< charArray.length; j++){
            arrayInt[j] = Character.getNumericValue(charArray[j]);
        }

        System.out.println("Массив после преобразования: " + Arrays.toString(arrayInt));
    }
}
