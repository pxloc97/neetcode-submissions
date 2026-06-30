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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) {
            return res;
        }
        queue.add(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            int max = 0;

            for(int i = 0; i < levelSize; i ++ ){
                TreeNode node = queue.poll();

                max = Math.max(max, node.val);

                if(node.left != null) {
                    queue.add(node.left);
                }

                if(node.right != null) {
                    queue.add(node.right);
                }
            }

            res.add(max);
        }


        return res;
    }
}
