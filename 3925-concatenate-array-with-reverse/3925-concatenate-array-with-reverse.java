class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        int a=0;
        for(int i=0;i<n;i++){
            ans[a++]=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            ans[a++]=nums[i];
        }
        return ans;
    }

}