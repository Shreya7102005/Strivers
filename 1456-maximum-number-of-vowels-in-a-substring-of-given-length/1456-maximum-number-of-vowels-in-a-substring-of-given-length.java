class Solution {
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    public int maxVowels(String s, int k) {
        int n=s.length();
        char ch[]=s.toCharArray();
        int l=0;
        int r=k-1;
        int count=0;
        int maxCount=Integer.MIN_VALUE;
        for(int i=l;i<=r;i++){
            if(isVowel(ch[i])){
                count++;
            }
        }
        maxCount=Math.max(maxCount,count);
        while(r<n-1){
            r++;
            if(isVowel(ch[r])){
                count++;
            }
            if(isVowel(ch[l])){
                count--;
            }
            l++;
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}