// Last updated: 7/9/2026, 9:16:20 AM
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode c1=headA,c2=headB;
        while(true)
        {
        if(c1==null && c2==null)
        break;
        if(c1==null)
        c1=headB;
        if(c2==null)
        c2=headA;
        if(c1==c2)
        return c1;
        c1=c1.next;
        c2=c2.next;
        }
        return c1;
    }
}
        