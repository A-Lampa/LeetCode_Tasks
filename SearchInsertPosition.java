package LeetCode;

//Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        int index = nums.length;

        for (int i = 0; i < nums.length; i++){
            if (target == nums[i]){
                index = i;
                break;
            } else if (target < nums[i]){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
