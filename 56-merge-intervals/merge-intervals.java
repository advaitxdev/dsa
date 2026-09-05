class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        int ans[][] = new int[intervals.length][2];
        ans[0] = intervals[0];

        int e = 0;

        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] <= ans[e][1]){
                ans[e][1] = Math.max(ans[e][1], intervals[i][1]);
            } else{
                e++;
                ans[e] = intervals[i];
            }

        }

        return Arrays.copyOfRange(ans, 0, e+1);
    }
}