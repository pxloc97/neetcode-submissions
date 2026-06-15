class Solution {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndex = new HashMap<>();

        int res  = 0;
        int j = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(charIndex.get(c)!=null) {
                j = Math.max(j, charIndex.get(c) + 1);
            }

            charIndex.put(c, i);
            res = Math.max(res, i - j + 1);
        }

        return res;
    }
}
