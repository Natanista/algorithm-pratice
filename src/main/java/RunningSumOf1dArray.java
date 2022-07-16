public class RunningSumOf1dArray {
    public int[] sumOf1dArray(int[] nums) {
        for (int i = 1; i <= nums.length - 1; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

}
