class Solution{
    public int maxFrequencyElements(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0,ans=0;
        for(int num:nums){
            int freq=map.getOrDefault(num,0)+1;
            map.put(num,freq);
            if(freq>max){
                max=freq;
                ans=freq;
            }else if(freq==max){
                ans+=freq;
            }
        }
        return ans;
    }
}