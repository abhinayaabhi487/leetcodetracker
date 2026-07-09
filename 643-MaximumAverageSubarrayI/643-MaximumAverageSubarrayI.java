// Last updated: 7/9/2026, 9:14:58 AM
class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n=arr.length;
        double sum=0,max=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        max=sum;
        for(int i=1;i<n-k+1;i++){
            sum=sum-arr[i-1]+arr[i+k-1];
            if(sum>=max){
                max=sum;
            }
        }
        return(double)max/k;
        }
    }
