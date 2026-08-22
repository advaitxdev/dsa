class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        

        int r=s.length()-1;

        for(int l=0; l<r; l++){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            } 
            r--;
        }

        return true;
    }
}