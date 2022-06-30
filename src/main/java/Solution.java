public class Solution {
  public int coinChange(int[] coins, int amount) {
    int[] minCoins = new int[amount+1];
    for (int m = 1; m <= amount; m++) {
      minCoins[m] = Integer.MAX_VALUE - 2;
      for (int coin : coins) {
        if (m - coin >= 0) {
          minCoins[m] = Math.min(minCoins[m], 1+ minCoins[m-coin]);
        }
      }
    }
    if (minCoins[amount] == Integer.MAX_VALUE - 2) {
      return -1;
    }
    return minCoins[amount];
  }
}
