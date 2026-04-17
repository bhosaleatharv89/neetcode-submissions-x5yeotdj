class Solution {
    public int longestConsecutive(int[] nums) {
        int maxlen = 1;
        if(nums.length<1)return 0; 
        Arrays.sort(nums);
        int prev = nums[0];
        int temp = 1;
        for(int i =1;i<nums.length;i++)
        { 
          if(prev == nums[i]) continue;
          if(prev+1 == nums[i])
          {
            temp+=1;
          }
          else if((prev+1)!= nums[i])
          {
            temp = 1;
          }
            prev = nums[i];
            maxlen = Math.max(maxlen,temp);
          
        }
        return maxlen;
    }
}
