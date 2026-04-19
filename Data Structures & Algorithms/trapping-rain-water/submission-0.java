class Solution {
    public int trap(int[] height) {
        int maxLeft[] = new int[height.length];
        int maxRight[] = new int[height.length];
        
        int maxL = 0, maxR = 0;
        int n = height.length;
        for(int i =0;i<height.length;i++)
        {
            maxLeft[i] = maxL; 
            maxRight[n-1-i] = maxR;
            maxL = Math.max(maxL, height[i]);
            maxR = Math.max(maxR,height[n-1-i]);
        }

        int output = 0;
        for(int i =0;i<n;i++)
        {
            int currWater = (Math.min(maxRight[i], maxLeft[i]) - height[i]);
            if(currWater<0) currWater = 0;
            output += currWater;
        }
        return output;
    }
}
