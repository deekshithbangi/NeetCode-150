package arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class SortColors {
    public void sortColors(int[] nums) {
        int right = 0, left = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[i] + nums[right];
                nums[left] = nums[i] - nums[right];
                nums[i] = nums[i] - nums[right];
                right++;
            }
            else if (nums[i] == 2) {
                nums[i] = nums[i] + nums[left];
                nums[left] = nums[i] - nums[left];
                nums[i] = nums[i] - nums[left];
                left--;
                right++;
            } else if (nums[i] == 1) continue;
        }
//        int zeroCount = 0, onesCount = 0, twoCount = 0;
//
//        for(int num : nums) {
//            if (num == 0) zeroCount += 1;
//            else if (num == 1) onesCount += 1;
//            else twoCount += 1;
//        }
//
//        for (int i = 0; i < zeroCount; i++) {
//            nums[i] = 0;
//        }
//
//        for (int i = zeroCount + 1; i <= onesCount + zeroCount ; i++) {
//            nums[i] = 1;
//        }
//
//        for (int i = zeroCount + onesCount + 1; i <= onesCount + zeroCount + twoCount ; i++) {
//            nums[i] = 2;
        }
    }
}
