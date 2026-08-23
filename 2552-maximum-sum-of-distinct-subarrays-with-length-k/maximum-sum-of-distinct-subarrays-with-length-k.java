class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l = 0;
        long sum = 0, max = 0;

        Set<Integer> res = new HashSet<>();

        for(int r = 0; r<nums.length; r++){
            while(res.contains(nums[r]) || res.size() == k){
                res.remove(nums[l]);
                sum -= nums[l];
                l++;
            }

            sum += nums[r];
            res.add(nums[r]);

            if(res.size() == k){
                max = Math.max(sum, max);
            }
        }

        return max;
    }
}