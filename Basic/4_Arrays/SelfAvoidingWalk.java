/** 
 *  Generate trials self-avoiding walks of length n.
 *  Report the fraction of time the random walk is non self-intersecting.
 */

public class SelfAvoidingWalk {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;
        boolean[][] mat = new boolean[n][n];

        for (int t = 0; t < trials; t++) {
            int x = n/2, y = n/2;

            // x and y both not reach the end
            while (x > 0 && x < n-1 && y > 0 && y < n-1) {
                // finish condition
                if (mat[x-1][y] && mat[x+1][y] && mat[x][y-1] && mat[x][y+1]) {
                    deadEnds++;
                    break;
                }

                mat[x][y] = true;
                
                double seed = Math.random();
                if (seed < 0.25) {
                    if (!mat[x][y+1])
                        y++;
                } else if (seed < 0.50) {
                    if (!mat[x][y-1])
                        y--;
                } else if (seed < 0.75) {
                    if (!mat[x-1][y])
                        x--;
                } else {
                    if (!mat[x+1][y])
                        x++;
                }   
            }   
        }
        System.out.println(100*deadEnds/trials + "% dead ends" );
    }
}