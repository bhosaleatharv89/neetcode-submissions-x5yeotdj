class Solution {
    public int maxArea(int[] heights) {
        int maxVol = 0;
        int start =0,end = heights.length-1;
        while(start<end)
        {
            int currVol = Math.min(heights[start],heights[end]) * (end - start);
            maxVol = Math.max(maxVol,currVol);
            if(heights[start]>heights[end])
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return maxVol;
    }
}
