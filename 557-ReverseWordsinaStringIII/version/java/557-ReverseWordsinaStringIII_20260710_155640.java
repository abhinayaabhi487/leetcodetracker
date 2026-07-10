// Last updated: 7/10/2026, 3:56:40 PM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        Arrays.sort(candyType);
4        int count=1;
5        for(int i=0;i<candyType.length-1;i++){
6            if(candyType[i]!=candyType[i+1]){
7                count++;
8            }
9        }
10        return Math.min(count,candyType.length/2);
11    }
12}