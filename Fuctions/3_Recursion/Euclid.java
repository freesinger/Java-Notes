/**
 *  Reads two command-line arguments p and q and computes the greatest
 *  common divisor of p and q using Euclid's algorithm.
 */

public class Euclid {
    // recursion
    private static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    // non-recursion
    private static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);

        int res = gcd(p, q);
        int res2 = gcd2(p, q);

        if (res == res2) System.out.println("GCD is: " + res);
        else System.out.println("Error!");
    }
}