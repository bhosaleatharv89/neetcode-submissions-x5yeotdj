class Solution {
    public boolean isPalindrome(String s) {
        int right = 0;
        int left = s.length()-1;
        s = s.toLowerCase();
        while(right<left)
        {
            if(!Character.isLetterOrDigit(s.charAt(right)))
            {
                right++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(left)))
            {
                left--;
                continue;
            }
            if(s.charAt(right) != s.charAt(left))return false;
            left--;
            right++;
        }
        return true;
    }
}
