// Last updated: 7/9/2026, 9:16:21 AM
class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;
    public MinStack() {
        st=new Stack<>();
        minst=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty())
        minst.push(val);
        else{
            minst.push(Math.min(minst.peek(),val));
        }
    }
    
    public void pop() {
        st.pop();
        minst.pop();

    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}