class MinStack {
    Deque<Integer> stack;
    PriorityQueue<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new PriorityQueue<>();
    }
    
    public void push(int val) {
        stack.push(val);
        minStack.offer(val);
    }
    
    public void pop() {
        minStack.remove(stack.pop());
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
       return minStack.peek();
    }
}
