// Last updated: 7/9/2026, 9:14:27 AM
class Solution {                               
    public int getDecimalValue(ListNode head) {
        int res=0;
        ListNode curr=head;
        while(curr!=null){
            res=res*2+curr.val;
            curr=curr.next;
        }
        return res;
    }
}
     