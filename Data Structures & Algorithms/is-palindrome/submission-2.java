class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder strbuilder = new StringBuilder();
        for(char c: s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                strbuilder.append(Character.toLowerCase(c));
            }
        }
        return strbuilder.toString().equals(strbuilder.reverse().toString());
    }
}
