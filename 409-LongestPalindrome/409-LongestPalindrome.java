// Last updated: 7/9/2026, 9:15:28 AM
class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        int length = 0;
        for (int i = 0; i < 128; i++) {
            if (count[i] % 2 == 0) {
                length += count[i];
            } else {
                length += count[i] - 1;
            }
        }
        if (length < s.length()) {
            length++;
        }
        return length;
    }
}