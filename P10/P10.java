import java.util.*;
import java.lang.Math;

public class P10 {
  static HashMap<Long, Boolean> primeMap;

  static {
   primeMap = new HashMap<Long, Boolean>();
  }

  static boolean isPrime (long num) {
    if (primeMap.get(num) == null) {
      primeMap.put(num, true);
      for (long i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          primeMap.put(num, false);
          break;
        }
      }
    }

    return primeMap.get(num);
  }

  public static void main(String args[]) {
    // final int MAX = 10;
    final int MAX = 2000000;

    long sum = 0;

    for (int i = 2; i < MAX; i++) {
      if (isPrime(i)) {
        sum += i;
      }
    }

    System.out.println(sum);
  }
}