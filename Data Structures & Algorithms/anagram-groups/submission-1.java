class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs)
        {
            int[] freq = new int[26];
            for(char c:str.toCharArray())
            {
                freq[c-'a']++;
            }
            
            StringBuilder key = new StringBuilder();
            for(int f : freq)
            {
                key.append(f).append("#");
            }
            map.computeIfAbsent(key.toString(),k->new ArrayList<>()).add(str);
        }

        List<List<String>> op = new ArrayList<>();
        for(String key: map.keySet())
        {
            op.add(map.get(key));
        }
        return op;

    }
}
