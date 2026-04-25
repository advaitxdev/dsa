// Last updated: 4/25/2026, 11:34:54 PM
class Solution {
    public int longestConsecutive(int[] nums) {
       HashMap<Integer,Boolean> map = new HashMap<>();
       int longest =0;
       for(int num:nums){
        map.put(num,Boolean.FALSE);
       }
       for(int num:nums){
        int currLength =1;
        int nextNum =num+1;
        while(map.containsKey(nextNum) && map.get(nextNum)==false){
            currLength++;
            map.put(nextNum,Boolean.TRUE);
            nextNum++;
        }
        int prevNum =num-1;
        while(map.containsKey(prevNum) && !map.get(prevNum)){
            currLength++;
            map.put(prevNum,Boolean.TRUE);
            prevNum--;
        }
        longest= Math.max(longest,currLength);
       }
        return longest;
    }
   
}