class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i =0;i<s.length();i++)
        {
            switch(s.charAt(i))
            {
                case '(':
                    stack.push(s.charAt(i));
                    break;
                case('['):
                    stack.push(s.charAt(i));
                    break;
                case('{'):
                    stack.push(s.charAt(i));
                    break;
                case(')'):
                    if(stack.isEmpty() || stack.pop()!='(')return false;
                    break;
                case(']'):
                    if(stack.isEmpty() || stack.pop()!='[')return false;
                    break;
                case('}'):
                    if(stack.isEmpty() || stack.pop()!='{')return false;
                    break;
            }
        }
        if(stack.size()>0)return false;
        return true;
    }

}
