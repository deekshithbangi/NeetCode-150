package arraysandhashing;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        // We all know that a^b^b =a, which means two xor operations with the same number
        // will eliminate the number and reveal the original number.

        int xor = nums.length ;

        for(int i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor;
    }
}
