class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> checkSets = new HashSet<>();

        // add into set
        for(int num: nums) {
            checkSets.add(num);
        }

        int length = 0;

        // check in set ;
        for(int i = 0; i < nums.length; i++) {
            if(!checkSets.contains(nums[i] - 1)) {
                int j = 1;
                while(checkSets.contains(nums[i] + j)) {
                        j++;
                    
                }
                length = Math.max(length, j);
            }
        }

        return length;
    }
}
