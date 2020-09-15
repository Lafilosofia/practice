package solution;

/**
 * 青蛙跳台阶问题
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 */

/*当n等于1的时候，只需要跳一次即可，只有一种跳法，记f(1)=1
当n等于2的时候，可以先跳一级再跳一级，或者直接跳二级，共有2种跳法，记f(2)=2
当n等于3的时候，他可以从一级台阶上跳两步上来，也可以从二级台阶上跳一步上来，所以总共有f(3)=f(2)+f(1)；
同理当等于n的时候，总共有f(n)=f(n-1)+f(n-2)(这里n>2)种跳法。
*/
public class Solution05 {
    //直接递归效率低重复计算
    public static int f(int n){
        if (n <= 1) {
            return 1;
        }
        if (n < 3){
            return n;
        }
        return f(n -1) + f(n - 2);
    }

    //非递归方法
    public int newWays(int i){
        if (n <= 1){
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3;i <= n;i ++){
            dp[i] = dp[i - 1] + dp[i - 2];
            dp[i] %= 100000007;
        }
        return dp[n];
    }
}
