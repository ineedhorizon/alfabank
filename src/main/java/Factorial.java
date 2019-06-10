import java.math.BigInteger;
import java.util.HashMap;

public class Factorial {

    private static HashMap<Integer, BigInteger> cache = new HashMap<>();

    public static BigInteger factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Number must be positive or 0.");
        if (n == 0) return BigInteger.ONE;
        if (cache.containsKey(n)) return cache.get(n);

        BigInteger res;
        res = BigInteger.valueOf(n).multiply(factorial(n - 1));
        cache.put(n, res);

        return res;
    }
}

