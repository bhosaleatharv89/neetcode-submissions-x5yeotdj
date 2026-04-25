class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs)
        {
            // if(str.length()<1)map.put(str,new ArrayList<>(str));
            
            int count[] = new int[26];
            for(char c : str.toCharArray())
            {
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }      
        output = new ArrayList<>(map.values());
        return output;


    }
}
