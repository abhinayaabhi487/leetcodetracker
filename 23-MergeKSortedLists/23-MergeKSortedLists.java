// Last updated: 7/9/2026, 9:17:19 AM
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        ListNode result = null;
        for (ListNode list : lists) {
            result = merge(result, list);
        }
        return result;
    }
    private ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (a != null && b != null) {
            if (a.val < b.val) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }
        if (a != null)
            curr.next = a;
        if (b != null)
            curr.next = b;
        return dummy.next;
    }
}