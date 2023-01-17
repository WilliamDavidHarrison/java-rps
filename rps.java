import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        char playAgain = 'y';
        while (playAgain == 'y') {
            int aiMove = rand.nextInt(3);
            String aiMoveString = "";
            if (aiMove == 0) {
                aiMoveString = "rock";
            } else if (aiMove == 1) {
                aiMoveString = "paper";
            } else {
                aiMoveString = "scissors";
            }
            System.out.print("Rock, paper, or scissors? (r/p/s): ");
            String playerMove = sc.next();
            System.out.println("AI plays " + aiMoveString + ".");
            String result = "";
            if (playerMove.equals("r")) {
                if (aiMove == 0) {
                    result = "It's a tie!";
                } else if (aiMove == 1) {
                    result = "You lose!";
                } else {
                    result = "You win!";
                }
            } else if (playerMove.equals("p")) {
                if (aiMove == 0) {
                    result = "You win!";
                } else if (aiMove == 1) {
                    result = "It's a tie!";
                } else {
                    result = "You lose!";
                }
            } else if (playerMove.equals("s")) {
                if (aiMove == 0) {
                    result = "You lose!";
                } else if (aiMove == 1) {
                    result = "You win!";
                } else {
                    result = "It's a tie!";
                }
            } else {
                result = "Invalid move. Please enter r, p, or s.";
            }
            System.out.println(result);
            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);
        }
    }
}
