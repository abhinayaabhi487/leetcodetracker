// Last updated: 7/9/2026, 9:15:39 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        while(n>1&&n%4==0) {
			n=n/4;
		}
        if(n==1){
            return true;
        }else{
            return false;
        }
    }
}