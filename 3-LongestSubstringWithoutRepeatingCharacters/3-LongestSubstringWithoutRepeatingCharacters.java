// Last updated: 4/25/2026, 11:35:07 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        HashSet<Character> seen = new HashSet<>();
        int l = 0; //left end of sliding window

        for(int r=0; r<s.length(); r++){ //right end of dynamic sliding window
            while(seen.contains(s.charAt(r))){ //if duplicate found, shrink from left
                seen.remove(s.charAt(l));
                l++;
            }

            seen.add(s.charAt(r));
            maxLength = Math.max(maxLength, r-l+1);
        }

        return maxLength;
    }
}