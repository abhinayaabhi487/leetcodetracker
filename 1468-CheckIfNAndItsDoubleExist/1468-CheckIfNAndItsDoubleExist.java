// Last updated: 7/9/2026, 9:14:25 AM
class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * 2 == arr[j] || arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}