// Last updated: 4/25/2026, 11:28:31 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l=0;
        int maxFreq=0;
        int maxWin=0;

        for(int r=0; r<s.length();r++){
            //updating frequency of current character
            freq[s.charAt(r) - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(r) - 'A']);
            int winLength = r-l+1;

            //shrinking window if following condition true
            if(winLength - maxFreq > k){
                freq[s.charAt(l)-'A']--;
                l++;
            }

            winLength = r-l+1;
            maxWin = Math.max(maxWin, winLength);
        }

        return maxWin;
    }
}