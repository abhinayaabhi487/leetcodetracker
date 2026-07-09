// Last updated: 7/9/2026, 9:14:44 AM
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
                {
                    inc=false;
                }

                else if(nums[i]>nums[i+1])
                {
                    dec=false;;
                }
        }
        return inc || dec;
    }
}