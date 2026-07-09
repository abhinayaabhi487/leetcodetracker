// Last updated: 7/9/2026, 9:16:33 AM
class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (Character.isLetterOrDigit(ch)) {
                str += ch;
            }
        }
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}