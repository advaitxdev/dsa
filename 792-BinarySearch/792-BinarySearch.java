// Last updated: 4/25/2026, 11:28:23 PM
class Solution {
    public int search(int[] nums, int target) {
        int mid = 0;
        int l = 0;
        int r = nums.length-1;

        while(l <= r){
            mid = l+(r-l)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                l = mid+1;
            } else if(nums[mid] > target){
                r = mid-1;
            }
        }

        return -1;
    }
}