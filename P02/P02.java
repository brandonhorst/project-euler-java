public class P02 {
  public static void main(String args[]) {
    final int MAX = 4000000;

    int sum = 0;

    //fibo
    int n0 = 0;
    int n1 = 1;
    while (n1 < MAX) {
      if (n1 % 2 == 0) {
        sum += n1;
      }
      int n2 = n0 + n1;
      n0 = n1;
      n1 = n2;
    }
    System.out.println(sum);
  }
}