class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }
        }
        int n=arr.size();
        for(int i=0;i<n;i++){
            nums[i]=arr.get(i);
        }
        return n;
    }
}