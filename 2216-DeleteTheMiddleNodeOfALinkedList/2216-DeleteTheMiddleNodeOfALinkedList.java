// Last updated: 7/9/2026, 9:14:18 AM
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }        
        ListNode slow=head,fast=head,temp=null;
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}