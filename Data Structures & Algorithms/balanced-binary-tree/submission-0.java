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

    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        res = true;
        height(root);
        return res;
    }

    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int heightLeft = height(root.left);
        int heightRight = height(root.right);

        if(Math.abs(heightLeft - heightRight) > 1) {
            res = false;
        }

        return 1  +  Math.max(heightLeft, heightRight);
    }
}
