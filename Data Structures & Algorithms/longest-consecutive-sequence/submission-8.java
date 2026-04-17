class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1)return 0;
        HashSet<Integer> set = new HashSet<>();
        int op = 1;
        for(int num: nums) set.add(num);
        int count = 0;
        for(Integer n : set)
        {
            if(set.contains(n-1))continue;
            else
            {
                int x = n;
                while(set.contains(x))
                {
                    count++;
                    x = x+1;
                }
                op = Math.max(op,count);
                count = 0;
            }
        }
        return op;
    }
}
