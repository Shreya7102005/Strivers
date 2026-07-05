class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char c[]=jewels.toCharArray();
        char ch[]=stones.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<c.length;j++){
                if(ch[i]==c[j]){
                    count++;
                }
            }
        }
        return count;
    }
}