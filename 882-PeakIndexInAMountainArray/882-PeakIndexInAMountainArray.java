// Last updated: 7/9/2026, 9:14:47 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=1;
        int h=arr.length-2,mid=0;
        if(arr.length>=3){
        while(l<=h){
            mid=(l+h)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1])
            return mid;
            else if(arr[mid]>arr[mid-1])
            l=mid+1;
            else
            h=mid-1;
        }
        }
        return 0;

    }
}