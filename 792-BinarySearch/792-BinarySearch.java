// Last updated: 7/9/2026, 9:14:50 AM
class Solution {
    public int search(int[] nums, int target) {
        int flag=0;
		int ind=-1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==target) {
                flag=1;
                ind=i;
				break;
			}
		}
		if(flag==1) {
            return ind;
            } else {
                return -1;
            }
    }
}