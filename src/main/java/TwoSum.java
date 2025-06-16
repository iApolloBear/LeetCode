import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/***
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

// Time Complexity: O(n)
// Space Complexity: O(n)

public class TwoSum {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoSum(new int[] {2, 7, 11, 15}, 9)));
    System.out.println(Arrays.toString(twoSum(new int[] {3, 2, 4}, 6)));
    System.out.println(Arrays.toString(twoSum(new int[] {3, 3}, 6)));
  }

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];

      if (map.containsKey(complement)) {
        return new int[] {complement, i};
      }

      map.put(nums[i], complement);
    }
    throw new IllegalArgumentException("No solution found");
  }
}
