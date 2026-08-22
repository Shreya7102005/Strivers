class Solution {
    public boolean checkString(String s) {
        char ch[]=s.toCharArray();
        int n=ch.length;
        for(int i=0;i<n-1;i++){
            if(ch[i]=='b' && ch[i+1]=='a'){
                return false;
            }
        }
        return true;
    }
}