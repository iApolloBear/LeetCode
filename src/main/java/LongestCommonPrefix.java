/***
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters if it is non-empty.
 */

// Time complexity: O(n) where n = total characters in all strings.
// Space complexity: O(1) only one variable needed.

public class LongestCommonPrefix {
  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[] {"flower", "flow", "flight"})); // fl
    System.out.println(longestCommonPrefix(new String[] {"dog", "racecar", "car"})); // ""
  }

  public static String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";

    String prefix = strs[0];

    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) return "";
      }
    }

    return prefix;
  }
}
