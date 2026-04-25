class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0, r=nums.length-1;

        while(l<r){
            int total = nums[l] + nums[r];

            if(total == target){
                return new int[] {l+1, r+1};
            } else if(total < target){
                l++;
            } else{
                r--;
            }
        }
        return new int[] {-1, -1};
    }
}