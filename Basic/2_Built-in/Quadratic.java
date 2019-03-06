/** Given b and c, solves for the roots of x*x + b*x + c.
 * Assumes both roots are real valued.
 */

public class Quadratic {
    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        double discriminant = b*b - 4*c;
        double sqroot = Math.sqrt(discriminant);

        double root1 = (-b + sqroot) / 2;
        double root2 = (-b - sqroot) / 2;

        System.out.println(root1);
        System.out.println(root2);
    }
}