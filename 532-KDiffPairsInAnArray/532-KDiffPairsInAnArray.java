// Last updated: 7/9/2026, 9:15:07 AM
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (nums[j] - nums[i] == k) {
                    count++;
                    break;
                }
                if (nums[j] - nums[i] > k) {
                    break;
                }
            }
        }
        return count;
    }
}