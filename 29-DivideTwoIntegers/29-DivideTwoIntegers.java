// Last updated: 7/9/2026, 9:17:12 AM
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        return dividend / divisor;
    }
}