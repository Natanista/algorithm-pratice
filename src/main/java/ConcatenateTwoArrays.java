public class ConcatenateTwoArrays {
    public int[] concatenateTwoArrays(int[] nums) {
        int[] output = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[i];
            for (int j = 0; j < nums.length; j++) {
                output[j + nums.length] = nums[j];
            }
        }
        return output;
    }

}
