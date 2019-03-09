/** Read in a sequence of real numbers, and computes their avg */

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0.0;

        Scanner in = new Scanner(System.in);
        // (Ctrl+d exit input)
        while (in.hasNextDouble()) {
            double number = in.nextDouble();
            sum += number;
            count++;
        }
        System.out.println("Average is: " + (sum / count));
        in.close();
    }
}