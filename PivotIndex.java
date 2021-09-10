package LeetCode;

public class PivotIndex {
    //Given an array of integers nums, calculate the pivot index of this array.
    //The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
    //If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
    //Return the leftmost pivot index. If no such index exists, return -1.

    public static void main(String[] args) {
        int[]array = {1,7,3,6,5,6};
        boolean findIndex = true;
        int sumRight = 0;
        int sumLeft = 0;

        while (findIndex){
            for (int i = 1; i < array.length - 1; i++){
                int pivotIndex = array[i];
                sumRight = 0;
                sumLeft = 0;
                for (int j = 1; j < array.length - i; j++){
                    sumRight = sumRight + array[i + j];
                    System.out.println("Сумма правая: " + sumRight);
                    }
                for (int k = 1; k <= i; k++) {
                    sumLeft = sumLeft + array[i - k];
                    System.out.println("Сумма левая: " + sumLeft);
                }

                if (sumLeft == sumRight){
                    System.out.println("Стоп сравнение! Мы нашли индекс, так как " + sumLeft + " равно " + sumRight);
                    System.out.println("Индекс равен " + pivotIndex);
                    break;
                    } else {
                    System.out.println("Ведем сравнение дальше, так как " + sumLeft + " не равно " + sumRight);
                }
                //System.out.println("Такого индекса для данного массива нет");
            }
            findIndex = false;
        }

    }

}
