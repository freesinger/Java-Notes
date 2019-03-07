/** Computes the square root of a nonnegative number c using
 *  Newton's method:
 *     - initialize t = c
 *     - replace t with the average of c/t and t
 *     - repeat until desired accuracy reached 
 * */

public class Sqrt {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        
        if (c < 0) { 
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        
        double epsilon = 1.0e-15;
        double t = c;

        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

        System.out.println(t);
    }
}