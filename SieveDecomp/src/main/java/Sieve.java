import java.util.Arrays;

public class Sieve {
    private static boolean[] fillSieve(int n) {
        boolean[] primes = new boolean[n + 1];

        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        final int N = 10;
        boolean[] sieves = fillSieve(N);

        for (int i = 0; i < N; i++) {
            if (sieves[i]) {
                System.out.println(i);
            }
        }
    }

}
