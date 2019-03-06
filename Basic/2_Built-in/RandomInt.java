/** Print a random integer from 0 ~ N-1 */

public class RandomInt {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Returns a double value with a positive sign, 
        // greater than or equal to 0.0 and less than 1.0. 
        double seed = Math.random();

        int value = (int)(n * seed);

        System.out.println(seed + " " + value);
    }
}