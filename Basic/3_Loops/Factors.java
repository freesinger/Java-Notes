/**  Computes the prime factorization of n using brute force. */

public class Factors {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);

        String res = "";
        for (int factor = 2; Math.pow(factor, 2.0) < n; factor++) {
            while (n % factor == 0) {
                n /= factor;
                if (n != 1)
                    res += (Integer.toString(factor) + " ");
                else {
                    System.out.println(res);
                    System.exit(0);
                }
            }
        }
        System.out.println(res + Long.toString(n));
    }
}