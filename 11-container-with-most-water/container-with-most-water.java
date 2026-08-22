class Solution {
    public int maxArea(int[] height) {
        int area = 0, max = 0;
        int l = 0;
        int r = height.length-1;

        while(l<r){
            area = Math.min(height[l], height[r]) * (r-l);
            max = Math.max(area, max);

            if(height[l]<height[r]){
                l++;
            } else{
                r--;
            }
        }

        return(max);
    }
}