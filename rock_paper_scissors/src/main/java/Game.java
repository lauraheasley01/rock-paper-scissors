import java.util.Random;

public class Game {

    Random random = new Random();

    public void startGame(User inGameUser) throws InterruptedException {

        String computerFinalAnswer;
        String winner = "";

        String userAnswer = inGameUser.getAnswer();                 // gets the users answer

        int computerAnswer = random.nextInt(3);               // Computers answer (between 0 and 2)

        if (computerAnswer == 0) {
            computerFinalAnswer = "Rock";
        } else if (computerAnswer == 1) {
            computerFinalAnswer = "Paper";
        } else {
            computerFinalAnswer = "Scissors";
        }

        System.out.println("The computer choose: " + computerFinalAnswer);

        if (computerFinalAnswer.equals("Rock") && userAnswer.equals("Rock")) {
            winner = "Draw";
        } else if (computerFinalAnswer.equals("Paper") && userAnswer.equals("Paper")) {
            winner = "Draw";
        } else if (computerFinalAnswer.equals("Scissors") && userAnswer.equals("Scissors")) {
            winner = "Draw";
        } else if (computerFinalAnswer.equals("Rock") && userAnswer.equals("Paper")) {
            winner = "User";
        } else if (computerFinalAnswer.equals("Paper") && userAnswer.equals("Rock")) {
            winner = "Computer";
        } else if (computerFinalAnswer.equals("Scissors") && userAnswer.equals("Rock")) {
            winner = "User";
        } else if (computerFinalAnswer.equals("Rock") && userAnswer.equals("Scissors")) {
            winner = "Computer";
        } else if (computerFinalAnswer.equals("Paper") && userAnswer.equals("Scissors")) {
            winner = "User";
        } else if (computerFinalAnswer.equals("Scissors") && userAnswer.equals("Paper")) {
            winner = "Computer";
        }

        Thread.sleep(2000);

        if (winner.equals("Draw")) {
            System.out.println("It's a draw! You both put " + computerFinalAnswer);
        } else if (winner.equals("Computer")) {
            System.out.println("You lost! " + computerFinalAnswer + " beats " + userAnswer);
        } else {
            System.out.println("You won! " + userAnswer + " beats " + computerFinalAnswer);
        }
    }
}
