// Last updated: 7/9/2026, 9:16:04 AM

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode a=null,b=head,c=head.next;
        while(b!=null){
            b.next=a;
            a=b;
            b=c;
            if(c!=null)
            c=c.next;
        }
        return a;
    }
}
        