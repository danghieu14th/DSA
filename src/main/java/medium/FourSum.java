package medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], target - i);
        }

        for(int j = 0; j < nums.length; j++){
            int sum = nums[j] + map.getOrDefault(nums[j], 0);
            if(sum == target){
                return null;
            }
        }
        return null;
    }
}
