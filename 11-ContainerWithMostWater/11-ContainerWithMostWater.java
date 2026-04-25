// Last updated: 4/25/2026, 11:35:05 PM
class Solution {
    public int maxArea(int[] height) {
        int l=0, r=height.length-1;
        int maxWater=0; 
        int currWater=0;

        while(l<=r){
            currWater = (r-l) * Math.min(height[r], height[l]);
            maxWater = Math.max(currWater, maxWater);

            if(height[l] < height[r]){
                l++;
            } else{
                r--;
            }
        }
        return maxWater;
    }
}