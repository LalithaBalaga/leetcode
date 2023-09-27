class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[]row : accounts){
            int sum = 0;
            for(int col : row){
                sum+=col;
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
