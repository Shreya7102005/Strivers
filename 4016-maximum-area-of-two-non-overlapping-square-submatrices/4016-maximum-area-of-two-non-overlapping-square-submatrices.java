class Solution {
    public int maxArea(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int dp[][]=new int[m][n];
        int maxK=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    if(i==0 || j==0){
                        dp[i][j]=1;
                    }
                    else{
                        dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                    }
                    maxK=Math.max(maxK,dp[i][j]);
                }
            }
        }
        int low=1,high=maxK;
        int ans=0;
        while(low<=high){
            int k=low+(high-low)/2;
            if(possible(dp,m,n,k)){
                ans=k;
                low=k+1;
            }
            else{
                high=k-1;
            }
        }
        return ans*ans;
    }
    private boolean possible(int[][]dp,int m,int n,int k){
        boolean[]row=new boolean[m];
        boolean[]col=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dp[i][j]>=k){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        boolean r[]=new boolean[m];
        boolean c[]=new boolean[n];
        for(int i=0;i<m;i++){
            r[i]=row[i] || (i>0 && r[i-1]);
        }
        for(int j=0;j<n;j++){
            c[j]=col[j] || (j>0 && c[j-1]);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dp[i][j]<k){
                    continue;
                }
                int top=i-k+1;
                int left=j-k+1;
                if(top>0 && r[top-1]){
                    return true;
                }
                if(left>0 && c[left-1]){
                    return true;
                }
            }
        }
        return false;
            
    }
}