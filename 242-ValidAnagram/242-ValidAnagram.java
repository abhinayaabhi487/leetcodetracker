// Last updated: 7/9/2026, 9:15:53 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            return true;
        }else{
            return false;
        }
    }
}