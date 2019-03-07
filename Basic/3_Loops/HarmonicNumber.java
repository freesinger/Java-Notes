/** Prints the nth harmonic number: 1/1 + 1/2 + ... + 1/n. */

public class HarmonicNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 1;
        double sum = 1.0 / i;

        while (++i <= n) {
            // System.out.println(i);
            sum += 1.0 / i;
            // System.out.println(sum);
        }
        
        System.out.println(sum);
    }
}