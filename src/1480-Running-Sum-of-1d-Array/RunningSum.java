public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        Solution solution = new Solution();

        int[] result = solution.runningSum(nums);
        for (int num : result) {
            System.out.print(num + " ");
        };
    }
}
/**
 * Calculates the running sum of an integer array.
 * 
 * @param An array of nums.
 * @return The running sum of nums.
 */
class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i=0; i < nums.length; i++){
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}