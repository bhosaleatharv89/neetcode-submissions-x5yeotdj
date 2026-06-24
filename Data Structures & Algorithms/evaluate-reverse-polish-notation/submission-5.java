class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for(String s : tokens)
        {
            
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/"))
            {
                stack.push(Integer.parseInt(s));
            }
            else if(s.equals("+"))
            {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a+b);
            }
            else if(s.equals("-"))
            {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }
            else if(s.equals("*"))
            {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a*b);
            }
            else if(s.equals("/"))
            {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
        }
        return stack.pop();
    }
}
