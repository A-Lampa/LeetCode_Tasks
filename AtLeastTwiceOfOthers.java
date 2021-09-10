package LeetCode;

public class AtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] array = {3, 20, 1, 40};
        int biggestItem = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (biggestItem < array[i]) {
                biggestItem = array[i];
                index = i;
            }
        }
        System.out.println("Самое большое число: " + biggestItem);
        for (int j = 0; j < index; j++) {
            if (biggestItem >= array[j] * 2) {
                System.out.println("Самое большое число в 2 раза больше, чем " + array[j]);
            } else {
                System.out.println("Самое большое число не больше в 2 раза, чем " + array[j]);
                biggestItem = 0;
                break;
            }
        }
        if (biggestItem > 0) {
            System.out.println("То самое число: " + biggestItem);
        } else {
            System.out.println("Такого числа нет");
        }
    }
}

