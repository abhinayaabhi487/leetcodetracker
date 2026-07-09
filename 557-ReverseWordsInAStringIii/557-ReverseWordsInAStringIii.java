// Last updated: 7/9/2026, 9:15:03 AM
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String ans = "";
        for (String word : words) {
            ans += new StringBuilder(word).reverse().toString() + " ";
        }
        return ans.trim();
    }
}