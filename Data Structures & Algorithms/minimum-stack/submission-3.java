class MinStack {
    private Deque<List<Integer>> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        if(stack.size()==0)stack.push(Arrays.asList(val,val));
        else
        {
            int minTillNow = Math.min(stack.peek().get(1), val);
            stack.push(Arrays.asList(val,minTillNow));
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().get(0);
    }
    
    public int getMin() {
       return stack.peek().get(1);
    }
}
