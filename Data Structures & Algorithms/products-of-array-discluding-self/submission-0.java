class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixs = new int[n];

        prefixs[0] = 1;
        for(int  i = 1; i < n; i++) {
            prefixs[i] = prefixs[i - 1] * nums[i-1];
        }

        int postfix = 1;

        for(int i = n -1 ; i >= 0; i --) {
            prefixs[i] = postfix * prefixs[i];
            postfix *= nums[i];
        }

        return prefixs;
    }
}  
