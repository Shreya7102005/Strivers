class Solution {
    public int countDominantElements(int[] nums) {
        int count = 0;
        int n = nums.length;

        if (n == 1) {
            return 1;
        }

        if (nums[0] >= nums[1]) {
            count++;
        }

        if (nums[n - 1] >= nums[n - 2]) {
            count++;
        }

        for (int i = 1; i < n - 1; i++) {
            long sum = (long) nums[i - 1] + nums[i + 1];

            if (2L * nums[i] >= sum) {
                count++;
            }
        }

        return count;
    }
}