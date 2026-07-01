class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int start=0;
        
        int res[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                res[start++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                res[start++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                res[start++]=nums[i];
            }
        }
        return res;
    }
    
}