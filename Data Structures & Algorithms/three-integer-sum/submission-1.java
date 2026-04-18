class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        int prev = 0;
        for(int i =0;i < nums.length;i++)
        {
            int target = nums[i] * -1;
            int start = i+1;
            int end = nums.length -1;
            if(i!=0 && prev == nums[i]) continue;
            while(start<end)
            {
                if(nums[start] + nums[end] == target)
                {
                    output.add(new ArrayList<>(List.of(nums[i],nums[start],nums[end])));
                    start++;
                    end--;

                    while(start<end && nums[start]==nums[start-1])start++;    
                    while(start<end && nums[end]==nums[end+1])end--;;    
                }
                if(nums[start] + nums[end]<target)
                {
                    start++;
                }
                if(nums[start] + nums[end]>target)
                {
                    end--;
                }
            }
            prev = nums[i];
        }
        return output;
    }
}
