class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int n:nums1){
            arr.add(n);
        }
        for(int n:nums2){
            arr.add(n);
        }
        Collections.sort(arr);
        int n=arr.size();
        if(n%2==0){
            return (double)(arr.get(n/2-1)+arr.get(n/2))/2;
        }
        return (double)arr.get(n/2);
    }
}