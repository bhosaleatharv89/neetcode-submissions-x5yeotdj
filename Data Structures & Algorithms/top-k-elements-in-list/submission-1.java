class Solution {
    public int[] topKFrequent(int[] nums, int k)
    {
        Map<Integer,Integer> freqmap = new HashMap<>();
        for(int num: nums)
        {
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }
        // array of lists
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int key : freqmap.keySet())
        {
            int freq = freqmap.get(key);
            if(bucket[freq]==null)
            {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        // list of only k freq elements
        List<Integer> output = new ArrayList<>();
        for(int i = bucket.length-1;i >= 0 && output.size()<k;i--)
        {
            if(bucket[i] != null)
            {
                output.addAll(bucket[i]);
            }
        }

        int[] result = new int[k];
        for(int i =0;i<k;i++)
        {
            result[i] = output.get(i);
        }
        return result;
    }
}
