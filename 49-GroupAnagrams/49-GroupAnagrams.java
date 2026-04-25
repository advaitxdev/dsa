// Last updated: 4/25/2026, 11:34:58 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length;i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String sortedWord = new String(temp);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}