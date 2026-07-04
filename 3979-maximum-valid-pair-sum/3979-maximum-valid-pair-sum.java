class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i>=k){
                max=Math.max(max,nums[i]+nums[i-k]);

            }
            if(i>0){
                nums[i]=Math.max(nums[i],nums[i-1]);
            }
        }
        return max;
    }
}