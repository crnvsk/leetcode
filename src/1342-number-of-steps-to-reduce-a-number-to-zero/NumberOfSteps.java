public class NumberOfSteps {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 14;
        int answer = solution.numberOfSteps(num);
        System.out.println(answer);

    }
}

/**
 * Calculate the number of steps to reduce an integer to zero.
 * 
 * @param An integer num.
 * @return The number of steps to reduce it to zero.
 */
class Solution {
    public int numberOfSteps(int num) {
        int answer = 0;
        int result = num;

        while (result != 0) {
            if(result % 2 == 0){
                result = result / 2;
                answer++;
            } else{
                result = result - 1;
                answer++;
            }
        }
        return answer;
    }
}