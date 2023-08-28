package easy;

import implement.TreeNode;

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int left, int right){
        if(left > right){
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode curr = new TreeNode(nums[mid]);
        curr.left = helper(nums, left, mid - 1);
        curr.right = helper(nums, mid + 1, right);
        return curr;
    }
}
