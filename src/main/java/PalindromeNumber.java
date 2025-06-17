/***
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */

// Time complexity: O(log10 n)
// Space complexity: O(1)

public class PalindromeNumber {
  public static void main(String[] args) {
    System.out.println(isPalindrome(121)); // true
    System.out.println(isPalindrome(-121)); // false
    System.out.println(isPalindrome(10)); // false
  }

  public static boolean isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }

    int reversed = 0;
    while (x > reversed) {
      reversed = reversed * 10 + x % 10;
      x /= 10;
    }

    return x == reversed || x == reversed / 10;
  }
}
