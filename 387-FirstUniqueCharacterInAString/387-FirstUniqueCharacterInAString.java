// Last updated: 7/9/2026, 9:15:32 AM
class Solution{
    public int firstUniqChar(String s){
        int[]freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
            }
            for(int i=0;i<s.length();i++){
                if(freq[s.charAt(i)-'a']==1){
                    return i;
                }
            }
            return -1;
    }
}