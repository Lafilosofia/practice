/**
 * 难度简单69收藏分享切换为英文关注反馈一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。
 * 求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 */

public class Subject02 {
    public int numWay(int n){
        if(n < 2){
            return 1;
        }
        int[] dp = new int[n + 2];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2 ;i <= n + 1;i ++){
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }
}
