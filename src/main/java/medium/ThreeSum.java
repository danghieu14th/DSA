package medium;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length - 2; i++){

            for(int j = i + 1; j < len; j++){
                int complement = -nums[i] - nums[j];
                if(map.containsKey(complement) && map.get(complement) == i){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(temp);
                    res.add(temp);
                }
                map.put(nums[j], i);
            }

        }

        return new ArrayList<>(res);
    }
}
