class Solution {

    public String encode(List<String> strs) {
        StringBuilder strBuilder = new StringBuilder();
        for(String s : strs)
        {
            strBuilder.append(s).append('-');
        }
        return strBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> op = new ArrayList<>();
        StringBuilder strDecode = new StringBuilder();
        for(char c : str.toCharArray())
        {
            if(c =='-')
            {
                op.add(strDecode.toString());
                strDecode.setLength(0);
            }
            else {strDecode.append(c);}
        }
        return op;
    }
}
