class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int j = 0;

        int[] memory = new int[26];
        int maxFrequent = 0;

        for (int i = 0; i < s.length(); i++) {
            memory[s.charAt(i) - 'A']++;
            maxFrequent = Math.max(maxFrequent, memory[s.charAt(i) - 'A']);

            while ((i - j + 1) - maxFrequent > k) {
                memory[s.charAt(j) - 'A']--;
                j++;
            }

            max = Math.max(max, i - j + 1);
        }

        return max;
    }
}
