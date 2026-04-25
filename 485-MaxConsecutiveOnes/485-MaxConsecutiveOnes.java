// Last updated: 4/25/2026, 11:28:28 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int curr=0;
        for(int i=0; i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                curr++;
            }
            else
            {
                curr=0;
            }
            ans=Math.max(ans,curr);
        }
        return ans;
    }
}