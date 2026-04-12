class Solution {
    public String encode(List<String> strs) {
        if(!strs.isEmpty())
        {
            return String.join("#<>#", strs);
        }
        else return null;
    }

    public List<String> decode(String str) {
        List<String> op = new ArrayList<>();
        if(str!=null)
        {    op = (Arrays.asList(str.split("#<>#",-1)));

        }
        return op;
    }
}
