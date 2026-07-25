class Solution {
    public boolean canReach(int[] start, int[] target) {
        int count=0;
        for(int i=0;i<start.length;i++){
           
                count+=(target[i]+start[i]);
            
        }
        return count%2==0;
    }
}