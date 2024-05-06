public class InvertTree {
    public void swapnode(TreeNode root) {
        TreeNode index = root.left;
        root.left = root.right;
        root.right = index;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        swapnode(root);
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
