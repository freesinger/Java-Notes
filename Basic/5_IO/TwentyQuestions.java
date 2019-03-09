import java.util.Scanner;

/*
*  I'm thinking of a number between 1 and 1,000,000 
*  What's your guess? 500000 
*  Too high 
*  What's your guess? 250000 
*  Too low 
*  What's your guess? 375000 
*  Too high 
*  What's your guess? 312500 
*  Too high 
*  What's your guess? 300500 
*  Too low 
*  ... 
**/

public class TwentyQuestions {
    public static void main(String[] args) {
        System.out.print("Guess the number 1 ~ 1000000 (q to quit): ");
        int secret = 1 + (int)(1000000 * (Math.random()));
        int guess = 0;

        Scanner in = new Scanner(System.in);

        while (secret != guess) {
            if (in.hasNextInt()) {
                guess = in.nextInt();
                // String guessStr = Integer.toString(guess);

                if (guess > secret) {
                    System.out.print("Too high, take another try: ");
                } else if (guess < secret) {
                    System.out.print("Too low, take another try: ");
                } else if (guess == secret) {
                    in.close();
                    System.out.println("Bingo!");
                    System.exit(0);
                }
            } else if (in.hasNext()){
                String guessStr = in.next();

                if (guessStr.equals("q") || guessStr.equals("Q")) {
                    in.close();
                    System.out.println("The number is : " + secret);
                    System.exit(0);
                } else {
                    System.out.print("Error input! Try again: ");
                    // in.next();
                }
            } else {
                in.close();
                System.exit(0);
            }
            // guess = in.nextInt();
        }
    }
}