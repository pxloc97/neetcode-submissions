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
    public int goodNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }

        if(root.left == null && root.right == null) {
            return 1;
        }

return helper(root, root.val);
    }

// Hàm helper này sẽ mang theo giá trị lớn nhất (maxSoFar) của đoạn đường trước đó
    private int helper(TreeNode node, int maxSoFar) {
        if (node == null) return 0;

        int count = 0;
        // Nếu node hiện tại lớn hơn hoặc bằng giá trị lớn nhất đã gặp -> hợp lệ!
        if (node.val >= maxSoFar) {
            count = 1;
        }

        // Cập nhật lại giá trị lớn nhất mới trước khi đi xuống các tầng dưới
        int newMax = Math.max(maxSoFar, node.val);

        // Đi tiếp xuống trái và phải, truyền theo giá trị newMax chính xác
        count += helper(node.left, newMax);
        count += helper(node.right, newMax);

        return count;
    }
}
