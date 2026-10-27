class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int num : nums) {
            numSet.add(num);
        }

        int result = 0;

        for(int num: nums) {
            if(!numSet.contains(num -1)) {
                int currentNum = num;
                int streak = 1;

                while(numSet.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }

                result = Math.max(result, streak);
            }
        }

        return result;
    }
}
