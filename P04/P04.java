public class P04 {
  static boolean isPalindrome (Integer num) {
    String stringVersion = num.toString();
    String reversedString = new StringBuilder(stringVersion).reverse().toString();
    return stringVersion.equals(reversedString);
  }

  public static void main(String args[]) {
    // final int MIN = 10;
    // final int MAX = 99;
    final int MIN = 100;
    final int MAX = 999;

    int largest = 0;
    for (int i = MIN; i <= MAX; i++) {
      for (int j = MIN; j <= MAX; j++) {
        int product = i * j;
        if (isPalindrome(product) && product > largest) {
          largest = product;
        }
      }
    }
    System.out.println(largest);
  }
}