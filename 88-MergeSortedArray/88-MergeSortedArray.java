// Last updated: 7/9/2026, 9:16:40 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int ind = 0;
        for (int i = 0; i < m; i++) {
            temp[ind++] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            temp[ind++] = nums2[i];
        }
        Arrays.sort(temp);
        for (int i = 0; i < m + n; i++) {
            nums1[i] = temp[i];
        }
    }
}