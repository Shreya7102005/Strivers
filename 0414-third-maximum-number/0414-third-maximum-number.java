class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }
        }
        Collections.sort(arr);
        int n=arr.size();

        if(n<3){
            return arr.get(n-1);
        }
        return arr.get(n-3);
    
    }
}