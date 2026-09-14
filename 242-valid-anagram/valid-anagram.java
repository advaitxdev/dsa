class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()) return false;

        char[] c1 = s.toCharArray();

        for(char c : c1){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(int i = 0; i< t.length(); i++){
            if(!map.containsKey(t.charAt(i)) || map.get(t.charAt(i))==0){
                return false;
            }
            map.put(t.charAt(i), map.get(t.charAt(i))-1);
            
        }

        

        return true;
    }
}