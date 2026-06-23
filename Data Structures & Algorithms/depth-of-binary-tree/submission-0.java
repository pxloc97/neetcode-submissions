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
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 1);
    }

    public int maxDepth(TreeNode root, int max) {
        if(root == null) {
            return max - 1;
        }

        return Math.max(maxDepth(root.left, max + 1), maxDepth(root.right, max + 1));
    }
}
