class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int dp[] = new int[amount+1];
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1 ;
        }

        for (int i = 1 ; i <= amount ; i++){
            for (int j : coins){
                if (i >=j) {
                    int temp = dp[i];
                    int temp2 = dp[i-j] + 1;
                    if(temp > temp2 ) dp[i] = temp2;
                }
            }
        }

        return dp[amount] == amount + 1 ? -1 : dp[amount];

    }
}