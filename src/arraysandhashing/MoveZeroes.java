package arraysandhashing;

import java.util.ArrayList;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;

        for(int num : nums) if (num == 0) zeroCount+=1;

        ArrayList<Integer> tmp = new ArrayList<>();

        for(int num : nums) if (num != 0) tmp.add(num);

        while (zeroCount > 0) {
            tmp.add(0);
            zeroCount--;
        }

        for(int i = 0; i < nums.length; i++) nums[i] = tmp.get(i);
    }
}