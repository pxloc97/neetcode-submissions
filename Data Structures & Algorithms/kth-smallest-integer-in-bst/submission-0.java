/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private int mem = 0;
    private int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        if(root == null) {
            return -1;
        }

        kthSmallest(root.left, k);
        mem++;

        if (mem == k) {
            result = root.val;
        }
        kthSmallest(root.right, k);

        return result;

    }
}
