// Last updated: 7/9/2026, 9:16:09 AM
class Solution {
    
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,0);
        dp[1] = nums[0];
        for(int i = 1; i< n; i++){
            int notTake = dp[i]; 
            int take = nums[i] + dp[i-1];
            dp[i+1] = Math.max(take,notTake);

        }

        return dp[n];
    }
}