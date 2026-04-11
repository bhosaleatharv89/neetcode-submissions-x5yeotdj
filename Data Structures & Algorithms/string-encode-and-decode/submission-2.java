class Solution {
    public String encode(List<String> strs) {
        StringBuilder strBuilder = new StringBuilder();
        for(String s : strs)
        {
            strBuilder.append(s).append("#<>#");
        }
        return strBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> op = new ArrayList<>();
        StringBuilder strDecode = new StringBuilder();
        StringBuilder strKey = new StringBuilder();
        for(char c : str.toCharArray())
        {
            if(strKey.length()>3)
            {
                strKey.deleteCharAt(0);
            }
            strKey.append(c);
            strDecode.append(c);
            if(strKey.toString().equals("#<>#"))
            {
                strDecode.delete(strDecode.length() - 4, strDecode.length());
                op.add(strDecode.toString());
                strKey.setLength(0);
                strDecode.setLength(0);
            
            }
        }
        return op;
    }
}
