import java.util.*;

public class Guessgame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secretnumber = 2;
        int guess;

        do {
            System.out.print("Guess the number (1 to 10): ");
            guess = sc.nextInt();

            if (guess > secretnumber) {
                System.out.println("Too high");
            } else if (guess < secretnumber) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct! You guessed it.");
            }

        } while (guess != secretnumber);

        sc.close();
    }
}
