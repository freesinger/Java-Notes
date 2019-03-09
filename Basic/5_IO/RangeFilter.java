import java.util.Scanner;

/* Read in a sequeces of integers fron std inoput
 * print out those values between lo and hi
 * Execution:    java RangeFilter lo hi < input.txt
 */

public class RangeFilter {
    public static void main(String[] args) {
        int low = Integer.parseInt(args[0]);
        int high = Integer.parseInt(args[1]);
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int num = in.nextInt();
            if (low < num && high > num) {
                System.out.println(num + " ");
            }
        }
        in.close();
    }
}