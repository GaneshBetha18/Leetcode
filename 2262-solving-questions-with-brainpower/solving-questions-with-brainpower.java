class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];
        dp[n-1] = questions[n-1][0];
        
        for (int i = n - 2; i >= 0; i--) {
            int points = questions[i][0], brainpower = questions[i][1];
            int nextIndex = Math.min(i + brainpower + 1, n);
            long solvePoints = points + (nextIndex < n ? dp[nextIndex] : 0);
            long skipPoints = dp[i + 1];
            dp[i] = Math.max(solvePoints, skipPoints);
        }
        
        return dp[0];
    }
}
