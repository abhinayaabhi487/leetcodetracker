// Last updated: 7/9/2026, 9:17:29 AM
class Solution {                      
    public int maxArea(int[] height) {
        int l = 0;//l=0
        int r = height.length - 1;
        int max = 0;//0
        while (l < r)
         {
            int wid = r - l;//6
            int minh = Math.min(height[l], height[r]);
            int ca = minh * wid;//48
            if (ca > max)
             {
                max = ca;
            }
            if (height[l] < height[r])
            {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}