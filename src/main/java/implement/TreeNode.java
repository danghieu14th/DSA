package implement;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public static TreeNode buildTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < nums.length) {
            TreeNode curr = q.remove();
            if (i < nums.length) {
                curr.left = new TreeNode(nums[i++]);
                q.add(curr.left);
            }
            if (i < nums.length) {
                curr.right = new TreeNode(nums[i++]);
                q.add(curr.right);
            }
        }
        return root;
    }

    public static TreeNode buildTree(Integer[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < nums.length) {
            TreeNode curr = q.remove();
            if (nums[i] != null){
                curr.left = new TreeNode(nums[i]);
                q.add(curr.left);
            }
            if (++i < nums.length && nums[i] != null){
                curr.right = new TreeNode(nums[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }

    public static TreeNode buildTree(String[] nums){
        if(nums.length == 0){
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();

        TreeNode root = new TreeNode(Integer.parseInt(nums[0]));

        q.add(root);

        int i = 1;
        for(; i < nums.length; i++){
            TreeNode curr = q.remove();
            if(!nums[i].equals("#")){
                curr.left = new TreeNode(Integer.parseInt(nums[i]));
                q.add(curr.left);
            }
            if(++i < nums.length && !nums[i].equals("#")){
                curr.right = new TreeNode(Integer.parseInt(nums[i]));
                q.add(curr.right);
            }
        }
        return root;
    }
}
