// Last updated: 7/9/2026, 9:16:55 AM
class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return false;
        }
        if (s.equals("Infinity") || s.equals("-Infinity")
                || s.equals("+Infinity")) {
            return false;
        }

        try {
            Double.parseDouble(s);

            char ch = s.charAt(s.length() - 1);

            if (ch == 'd' || ch == 'D' || ch == 'f' || ch == 'F') {
                return false;
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}