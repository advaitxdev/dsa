// Last updated: 4/25/2026, 11:34:47 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProd = new int[nums.length];
        int[] rightProd = new int[nums.length];

        for(int i=0, temp=1; i<nums.length; i++){
            leftProd[i] = temp;
            temp *= nums[i];
        }

        for(int i=nums.length-1, temp=1; i>=0; i--){
            rightProd[i] = temp;
            temp *= nums[i];
        }

        int[] result = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            result[i] = leftProd[i] * rightProd[i];
        }

        return result;
    }
}