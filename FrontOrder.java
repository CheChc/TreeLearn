import java.util.ArrayList;
import java.util.List;

public class FrontOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void traversal(TreeNode root, List<Integer> lis) {
        if (root == null)
            return;

        lis.add(root.val);//mid
        traversal(root.left, lis);//left
        traversal(root.right, lis);//right
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traversal(root, result);
        return result;

    }
}
