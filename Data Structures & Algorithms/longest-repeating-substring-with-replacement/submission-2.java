class Solution {
    public int characterReplacement(String s, int k) {
        int maxf =0;
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen = 0;
        int l =0,r=0;
        while(r<s.length())
        {
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0) + 1);
            maxf = Math.max(maxf,map.get(ch));

            // if((r-l+1)-maxf > k)
            // {
            //     map.put(s.charAt(l),map.get(s.charAt(l)-1));
            //     l++;
            // }
            while ((r - l + 1) - maxf > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            // if((r-l+1)-maxf <= k)
            // {
                maxLen = Math.max(maxLen,r-l+1);
            // }
            r++;
        }
        return maxLen;
    }
}
