class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        //叶子节点直接将val存进数组返回
        if (root.left == null && root.right == null) {
            list.add(String.valueOf(root.val));
        }

        /*
         * 对于非叶子节点，
         * 把左右子树返回的List的值依次和当前结点的val组装，
         * 即可得到所有以当前结点为根的所有路径
         */
        List<String> left = binaryTreePaths(root.left);
        for (int i = 0; i < left.size(); i++) {
            list.add(root.val + "->" + left.get(i));
        }

        List<String> right = binaryTreePaths(root.right);
        for (int i = 0; i < right.size(); i++) {
            list.add(root.val + "->" + right.get(i));
        }


        return list;
    }
}