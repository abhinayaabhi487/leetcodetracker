// Last updated: 7/9/2026, 9:14:30 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] a = new int[2001];
        for(int i:arr){
            a[i +1000]++;
        }
        boolean[] freq = new boolean[1001];
        for(int i:a){
            if(i == 0){
                continue;
            }
            if(freq[i]){
                return false;
            }
            else{
                freq[i] = true;
            }
        }
        return true;

    }
}