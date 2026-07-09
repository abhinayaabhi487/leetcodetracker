// Last updated: 7/9/2026, 9:16:11 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n];
        int index = 0;
        for(int i = n - k; i < n; i++) {
            temp[index++] = nums[i];
        }
        for(int i = 0; i < n - k; i++) {
            temp[index++] = nums[i];
        }
        for(int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}