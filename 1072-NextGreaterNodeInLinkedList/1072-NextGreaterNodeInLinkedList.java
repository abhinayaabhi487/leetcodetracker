// Last updated: 7/9/2026, 9:14:35 AM
class Solution {                                 
    public int[] nextLargerNodes(ListNode head) {
            HashMap<ListNode,Integer> h=new HashMap<>();
            Stack<ListNode> st=new Stack<>();
            ListNode curr=head,x=null;
            int n=0;
            while(curr!=null){
                if(st.empty())
                st.push(curr);
                else{
                    while(!st.empty() && curr.val>st.peek().val){
                        x=st.pop();
                        h.put(x,curr.val);
                    }
                    st.push(curr);
                    curr=curr.next;
                    n++;
                    }
                }
                while(!st.empty()){
                    h.put(st.pop(),0);
                }
                System.out.println(h);
                int[] arr=new int[n];
                curr=head;
                int i=0;
                while(curr!=null){
                    arr[i]=h.get(curr);
                    curr=curr.next;
                    i++;
                }
                return arr;
    }
}