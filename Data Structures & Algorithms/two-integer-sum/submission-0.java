class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for(int i = 0; i < nums.length; i ++ ) {
            if(numToIndex.get(target - nums[i]) != null) {
                return new int[]{numToIndex.get(target - nums[i]), i};
            }

            if(numToIndex.get(nums[i]) == null) {
                numToIndex.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
