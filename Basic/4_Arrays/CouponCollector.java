/** Given n distinct card types, how many random cards do you need
 *  do collect before you have (at least) one of each type?
 *  This program simulates this random process. 
 * */

public class CouponCollector {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isCollected = new boolean[n];
        int count = 0;
        int position = 0;

        while (position < n) {
            int value = (int) (Math.random() * n);
            count++;
            if (!isCollected[value]) {
                position++;
                isCollected[value] = true;
            }
        }
        System.out.println(count);
    }
}