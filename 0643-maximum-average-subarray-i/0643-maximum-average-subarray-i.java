class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=l+(k-1);
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=l;i<=r;i++){
            sum+=nums[i];
        }
        
        maxSum=Math.max(maxSum,sum);
        while(r<n-1){
            r++;
            sum-=nums[l];
            sum+=nums[r];
            maxSum=Math.max(maxSum,sum);
            l++;
            
        }

        
        return (double)maxSum/k;
    }
}