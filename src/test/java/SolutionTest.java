import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final  private Solution sol = new Solution();
  @Test
  void coinChangeExample1() {
    assertEquals(3, sol.coinChange(new int[]{1,2,5}, 11));
  }
  @Test
  void coinChangeExample2() {
    assertEquals(-1, sol.coinChange(new int[]{2}, 3));
  }
  @Test
  void coinChangeExample3() {
    assertEquals(0, sol.coinChange(new int[]{1}, 0));
  }
}