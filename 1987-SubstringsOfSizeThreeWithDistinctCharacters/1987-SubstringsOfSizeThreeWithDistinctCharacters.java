// Last updated: 7/9/2026, 9:14:21 AM
class Solution {                               
    public int countGoodSubstrings(String s) { 
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i+2) && s.charAt(i+1)!=s.charAt(i+2)){
                count++;
            }
        }
        return count;
    }
}