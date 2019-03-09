/** This program takes two command-line arguments m and n and produces
 *  a random sample of m of the integers from 0 to n-1. 
 */

public class Sample {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int[] perm = new int[n];

        /* for (int i = 0; i < n; i++) {
            perm[i] = i;
        } */

        for (int j = 0; j < m; j++) {
            int genNum = (int) (Math.random() * (n - j));
            perm[j] = genNum;
        }

        for (int i = 0; i < m; i++)
            System.out.print(perm[i] + " ");
        System.out.println();
    }
}