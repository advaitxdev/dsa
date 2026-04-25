// Last updated: 4/25/2026, 11:28:29 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            nums[index] = -Math.abs(nums[index]);
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }

        return ans;
    }
}