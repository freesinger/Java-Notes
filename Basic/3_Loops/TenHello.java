/** Print 10 "ith Hello" on screen */

public class TenHello {
    public static void main(String[] args) {
        // int num = Integer.parseInt(args[0]);

        System.out.println("1st Hello");
        System.out.println("2nd Hello");
        System.out.println("3rd Hello");

        int pos = 4;
        // pos <= num
        while (pos <= 10) { 
            System.out.println(pos + "th Hello");
            pos += 1;
        }
    }
}