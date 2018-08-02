class Solution {
    public int minDepth(TreeNode root) {
        //若初始传进的根结点是null，直接返回0
        if (root == null ) {
            return 0;
        }

        //如果一个结点的左右子结点都是null,
        //说明它是一个叶子结点,直接返回1
        if (root.left == null && root.right == null) {
            return 1;
            //如果一个结点的左子节点为null,右子结点不为null,
            //说明不能继续向左走,只能向右走
        } else if (root.left == null) {
            return minDepth(root.right) + 1;
        } else if (root.right == null) {
            return minDepth(root.left) + 1;
            //如果两个子节点都不为null,
            //则分别对两个子节点继续递归
        } else {
            int leftMaxDepth = minDepth(root.left);
            int rightMaxDepth = minDepth(root.right);
            int depth = Math.min(leftMaxDepth,rightMaxDepth) + 1;
            return depth;
        }



    }
}