class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mem = new HashMap<>();

for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (mem.containsKey(complement)) {
                return new int[] { mem.get(complement), i };
            }

            mem.put(nums[i], i);
        }

        return new int[0];
    }
}
