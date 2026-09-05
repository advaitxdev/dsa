class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int l = 0, r = m*n-1;

        while(l <= r){
            int mid = (l+r)/2;
            int midElement = matrix[mid/n][mid%n];

            if(target == midElement){
                return true;
            } else if(target > midElement){
                l = mid+1;
            } else{
                r = mid-1;
            }
        }

        return false;
    }
}