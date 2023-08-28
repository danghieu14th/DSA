package easy;

public class FindFirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        int first = find(nums, 0, nums.length - 1, target);
        if(first == -1){
            return new int[]{-1,-1};
        }
        int last = find(nums, first + 1, nums.length - 1, target);

        if(last == -1) {
            last = find(nums, 0, first - 1, target);
            if(last != -1){
                int temp = last;
                last = first;
                first = temp;
            } else{
                if(first == -1)
                    return new int[]{-1,-1};
                else{
                    return new int[]{first, first};
                }
            }
        }
        return new int[]{first, last};
    }

    public int find(int nums[], int left, int right, int target){

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                right = mid -1;
            }
            if(nums[mid] < target){
                left = mid + 1;
            }
        }
        return -1;
    }
}
