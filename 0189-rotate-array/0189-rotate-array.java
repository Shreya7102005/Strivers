class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int a=n-k;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=a;i<n;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<a;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            nums[i]=arr.get(i);
        }
    }
}