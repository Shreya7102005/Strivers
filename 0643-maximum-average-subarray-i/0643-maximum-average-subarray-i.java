class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double avg=0;
        int l=0;
        int maxSum=Integer.MIN_VALUE;;
        int r=l+(k-1);
        while(r<n){
            int sum=0;
            for(int i=l;i<=r;i++){
                sum+=nums[i];

            }
            l++;
            r++;
            maxSum=Math.max(maxSum,sum);
        }
        return (double)maxSum/k;
    }
}