import java.util.*;
import java.lang.Math;

public class P07 {
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
    // final long NTH = 6;
    final long NTH = 10_001;

    int count = 0;
    for (long i = 2;; i++) {
      if (isPrime(i)) {
        count++;
        if (count == NTH) {
          System.out.println(i);
          break;
        }
      }
    }
  }
}