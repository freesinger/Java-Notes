/** 
 *  Computes the number of primes less than or equal to n using
 *  the Sieve of Eratosthenes.
 *  *               n     Primes <= n
 *  ---------------------------------
 *                 10               4   
 *                100              25  
 *              1,000             168  
 *             10,000           1,229  
 *            100,000           9,592  
 *          1,000,000          78,498  
 *         10,000,000         664,579  
 *        100,000,000       5,761,455  
 *      1,000,000,000      50,847,534  
 */

public class PrimeSieve {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count = 0;
        System.out.print("The number of primes <= " + n + " is ");

        for (int i = 2; i <= n; i++)
            if (isPrime(i)) count++;

        System.out.println(count);
    }

    private static boolean isPrime(int number) {
        int checkElem = 2;
        
        while (checkElem <= (int) (Math.pow(number, 0.5))) {
            if (number % checkElem == 0) return false;
            else checkElem++;
        }

        return true;
    }
}