class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int nu=nums.length;
        int mid=nu/2;
        int count=0;
        for(int n:nums){
            if(n==nums[mid]){
                count++;
            }
        }
        return count==1;
    }
}