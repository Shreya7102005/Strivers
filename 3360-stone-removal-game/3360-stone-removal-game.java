class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int count=0;
        int a=10;
        while(a>0 && n>=a){
            n=n-a;
            a--;
            count++;
        }
        return count%2==1;
    }
}