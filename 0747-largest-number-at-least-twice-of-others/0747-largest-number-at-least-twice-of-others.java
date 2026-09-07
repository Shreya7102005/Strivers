class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int index=0;
        int lar=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>lar){
                lar=nums[i];
                index=i;
            }
        }
        //int count=0;
        for(int i=0;i<n;i++){
            if(i!=index && lar<2*nums[i]){
                return -1;
            }
        }
        
        return index;
    }
}