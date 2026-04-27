class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];
        // freq counter
        for(int num:nums)map.put(num,map.getOrDefault(num, 0)+1);

        //init freq
        for(int i =0;i<freq.length;i++) freq[i] = new ArrayList<>();

        //store in freq : index as frequency and value as elements 
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            freq[entry.getValue()].add(entry.getKey());
        }

        //store top k frequent elements in output array 
        int output[] = new int[k];
        int idx =0;
        for(int i = freq.length - 1;i>=0 && idx<k;i--)
        {
            for(Integer n : freq[i])
            {
            output[idx++] = n;
            if(idx ==k)return output;
            }
        }
        return output;

    }
}
