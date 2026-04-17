class Solution {
    public int longestConsecutive(int[] nums) {
        int maxlen = 1;
        if(nums.length<1)maxlen=0; 
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++)
        { int temp = 1;
           int prev = nums[i];
            for(int j=0;j<nums.length;j++)
            {
                if(i==j || nums[i]==nums[j])continue;
                if(prev+1 == nums[j])
                {
                    temp+=1;
                    maxlen = Math.max(temp,maxlen);
                    prev = nums[j];
                }
            }
        }
        return maxlen;
    }
}
