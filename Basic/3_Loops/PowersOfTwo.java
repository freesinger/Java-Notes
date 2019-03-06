/** This program takes a command-line argument n and prints a table of
    the powers of 2 that are less than or equal to 2^n. */

public class PowersOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int i = 0;
        int powerOfTwo = 1;

        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);
            powerOfTwo *= 2;
            i += 1;
        }
    }
}