// Last updated: 7/9/2026, 9:14:48 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String temp = s + s;
        if (temp.contains(goal)) {
            return true;
        } else {
            return false;
        }
    }
}