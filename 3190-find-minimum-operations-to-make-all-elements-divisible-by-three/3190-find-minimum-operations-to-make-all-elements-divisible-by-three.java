class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i]%3;
            if(a==2){
                count+=1;
            }
            else count+=a;
        }
        return count;
    }
}