class Solution {
    public int[] productExceptSelf(int[] nums) {
        int op[] = new int[nums.length];
        for(int i =0;i<nums.length;i++)
        {
            int d = 1;
            for(int j=0;j<nums.length;j++)
            {
                if(j==i) continue;
                d *= nums[j];
            }
            op[i] = d;
        }
        return op;
    }
}  
