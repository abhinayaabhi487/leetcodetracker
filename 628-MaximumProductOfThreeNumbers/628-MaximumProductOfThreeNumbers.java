// Last updated: 7/9/2026, 9:15:00 AM
class Solution {
    public int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int a = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
        int b = arr[0] * arr[1] * arr[arr.length - 1];
        return Math.max(a, b);
    }
}