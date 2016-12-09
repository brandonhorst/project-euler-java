import java.lang.Math;

public class P06 {
  public static void main(String args[]) {
    final long MAX = 100;

    long sumOfSquares = 0;
    long sum = 0;
    for (long i = 1; i <= MAX; i++) {
      sumOfSquares = sumOfSquares + (long)Math.pow(i, 2);
      sum = sum + i;
    }
    final long squareOfSums = (long)Math.pow(sum, 2);

    System.out.println(squareOfSums - sumOfSquares);
  }
}