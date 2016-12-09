public class P09 {
  static boolean isPythagoreanTriplet (int a, int b, int c) {
    return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
  }
  public static void main(String args[]) {
    // final int SUM = 12;
    final int SUM = 1000;

    for (int a = 1; a < SUM; a++) {
      for (int b = a; b < SUM; b++) {
        for (int c = b; c < SUM; c++) {
          if (a < b && b < c && (a + b + c == SUM) && isPythagoreanTriplet(a, b, c)) {
            System.out.println(a * b * c);
            return;
          }
        }
      }
    }


  }
}