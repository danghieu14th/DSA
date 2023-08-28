package medium;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
      return binarySearch(nums, 0, nums.length - 1, target);
    }

    public int binarySearch(int[] nums, int left, int right, int target) {
        if(left <=right){
            int middle = (left + right) / 2;

            if (target == nums[middle]) {
                return middle;
            }

            if (nums[left] <= nums[middle]) {
                if (target < nums[middle] && target >= nums[left]) {
                    return binarySearch(nums, left, middle - 1, target);
                }
                return binarySearch(nums, middle + 1, right, target);

            }
// 6 7 1 2 3 4 5; 4,5,6,7,0,1,2

            if (target > nums[middle] && target <= nums[right]) {
                return binarySearch(nums, middle + 1, right, target);
            }
            return binarySearch(nums, left, middle - 1, target);
        }
        return -1;
    }
}
