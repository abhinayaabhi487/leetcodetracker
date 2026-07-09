// Last updated: 7/9/2026, 9:16:43 AM
class Solution {
    public boolean search(int[] nums, int target) {
        int flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                flag=1;
                break;
            }
        }
        if(flag==1){
            return true;
        }else{
            return false;
        }
    }
}