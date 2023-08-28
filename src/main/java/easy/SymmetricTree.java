package easy;

import implement.TreeNode;

public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    public static boolean isMirror(TreeNode node1, TreeNode node2){
        if(node1 ==null || node2 == null){
            return node1==node2;
        }

        return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }
}
