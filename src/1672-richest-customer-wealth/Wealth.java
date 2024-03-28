public class Wealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };
        Solution solution = new Solution();
        int maxWealth = solution.maximumWealth(accounts);
        System.out.println(maxWealth);
    }
}

/**
 * Calculates the maximum wealth of a customer.
 * 
 * @param  An m x n integer grid accounts.
 * @return The wealth that the richest customer has.
 */
class Solution {
    public int maximumWealth(int[][] accounts) {
         int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }

            maxWealth = Math.max(maxWealth, wealth);
        }

        return maxWealth;
    }
}
