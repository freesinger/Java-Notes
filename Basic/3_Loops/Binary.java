/** Prints out n in binary. */

public class Binary {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String result = "";

        while (n / 2 != 0) {
            result = Integer.toString(n % 2) + result;
            n /= 2;
        }
        if (n == 0) result += "0";
        else result = "1" + result;

        System.out.println(result);
    }
}