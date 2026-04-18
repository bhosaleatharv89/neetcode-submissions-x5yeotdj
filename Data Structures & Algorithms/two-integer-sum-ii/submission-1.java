class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i = 0 ;i<numbers.length;i++)
        {
            int k = target - numbers[i];
            if(m.containsKey(k))
            {
                return new int[]{m.get(k)+1,i+1};
            }
            m.put(numbers[i],i);
        }
        return new int[1];
    }
}
