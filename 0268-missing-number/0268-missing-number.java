class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int lar=nums[n-1];
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return lar+1;
    }
}