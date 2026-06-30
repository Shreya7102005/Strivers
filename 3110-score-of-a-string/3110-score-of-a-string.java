class Solution {
    public int scoreOfString(String s) {
        int score=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            score += Math.abs(ch[i] - ch[i + 1]);
        }
        return score;
    }
}