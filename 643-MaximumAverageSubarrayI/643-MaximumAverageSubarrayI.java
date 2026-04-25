// Last updated: 4/25/2026, 11:28:26 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {

        //USING SLIDING WINDOW

        int sum = 0;

        //computing sum of first 'k' elements
        for(int i=0; i<k; i++){
            sum += nums[i];
        }

        int maxSum = sum;

        //slide the window across the array
        for(int i=k; i<nums.length; i++){
            sum += nums[i]; //add element entering the window
            sum -= nums[i-k]; //subtract element leaving the window
            maxSum = Math.max(sum, maxSum);
        }

        return (double) maxSum/k;
    }
}