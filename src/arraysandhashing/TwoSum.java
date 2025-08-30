package arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        /*
            Plan - 1
            Loop each element with every other element,
            Check if there sum is equal to target

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if( nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};

        */

        /*
            Plan - 2
            Use an HashMap
        */
        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if(indices.containsKey(diff)) {
                return new int[]{i, indices.get(diff)};
            }

            indices.put(nums[i], i);
        }
        return new int[]{};
    }
}
