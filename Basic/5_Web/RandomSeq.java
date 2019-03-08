/** Prints n random sequences between 0 ~ 1 */

public class RandomSeq {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            String format = "%.4f";
            System.out.printf(format, Math.random());
            System.out.println();
        }
    }
}