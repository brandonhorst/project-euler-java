import java.util.*;
import java.lang.Math;

public class P03 {
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

  static List<Long> factors (long num) {
    for (long i = 2; i <= num; i++) {
      if (num % i == 0) {
        List<Long> thisFactorFactors;
        if (isPrime(i)) {
          thisFactorFactors = new ArrayList<Long>();
          thisFactorFactors.add(i);
        } else {
          thisFactorFactors = factors(i);
        }
        List<Long> otherFactors = factors(num / i);
        List<Long> resultList = new ArrayList<Long>(thisFactorFactors);
        resultList.addAll(otherFactors);
        return resultList;
      }
    }
    return new ArrayList<Long>();
  }

  public static void main(String args[]) {
    // final long num = 13195L;
    final long num = 600851475143L;
    List<Long> factors = factors(num);
    System.out.println(factors.get(factors.size() - 1));
  }
}