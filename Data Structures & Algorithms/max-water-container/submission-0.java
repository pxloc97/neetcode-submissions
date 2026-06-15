class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int max = 0;

        while(i !=  j) {
            max = Math.max(max, (j - i) * Math.min(heights[i], heights[j]));

            if(i < j && heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }
}
