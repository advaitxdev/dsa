class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        int totalMaxFreqElements = 0;

        for (int num : nums) {
            int count = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, count);

            if (count > maxFreq) {
                maxFreq = count;
                totalMaxFreqElements = count;
            } else if (count == maxFreq) {
                totalMaxFreqElements += maxFreq;
            }
        }

        return totalMaxFreqElements;
    }
}