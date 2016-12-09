public class P05 {
  public static void main(String args[]) {
    final int MIN = 1;
    // final int MAX = 10;
    final int MAX = 20;

    for (int i = 1;; i++) {
      boolean failed = false;
      for (int j = MIN; j <= MAX; j++) {
        if (i % j != 0) {
          failed = true;
          break;
        }
      }
      if (!failed) {
        System.out.println(i);
        break;
      }
    }
  }
}