import java.util.HashMap;
import java.util.Map;

public class MaxSubarrayLength {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3,1,2};
        int k = 2;
        
        Solution solution = new Solution();
    
        System.out.println(solution.maxSubarrayLength(nums, k));

    }
}

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> numDict = new HashMap<>();
        int resultado = 0;
        for (int num : nums){
            
        }
        return resultado;
    }
}

