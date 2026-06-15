class Solution {

    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        int[] memT = new int[128];
        int[] memS = new int[128];
        int have = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int left = 0;
        int formed = 0;

        for (char c : t.toCharArray()) {
            memT[c]++;
        }

        int required = 0;  // Số loại ký tự duy nhất cần thỏa mãn
        for (int count : memT) {
            if (count > 0) required++;
        }

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            memS[c]++;

            if (memT[c] > 0 && memS[c] == memT[c]) {
                formed++;
            }

            while (formed == required && left <= right) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char d = s.charAt(left);
                memS[d]--;
                if (memT[d] > 0 && memS[d] == memT[d] - 1) {
                    formed--;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
