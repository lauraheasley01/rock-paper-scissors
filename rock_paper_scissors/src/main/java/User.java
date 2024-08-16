import java.util.Scanner;

public class User {

    private String answer;
    Scanner user_input = new Scanner(System.in);

    public void userStart() {               // RENAME AFTER
        boolean startOrQuit;
        System.out.println("Are you ready to play? (Y or N)");

        String startTheGame = user_input.next();

        if (startTheGame.equals("Y") || startTheGame.equals("y")) {
            startOrQuit = true;
        } else if (startTheGame.equals("N") || startTheGame.equals("n")) {
            System.out.println("You choose to not start the game. Goodbye");
            startOrQuit = false;
        } else {
            System.out.println("Character not recognised. Please enter either Y or N");
            startOrQuit = false;
            userStart();                // Get the user to input another answer --> add a loop?
        }
    }

    public void setAnswer() {
        System.out.println("What's your go?");
        String choice = user_input.next();

        if (choice.equals("0")) {
            // answer set to rock
            this.answer = "Rock";
            System.out.println("You choose rock...");  // Delete after
        } else if (choice.equals("1")) {
            // answer set to paper
            this.answer = "Paper";
            System.out.println("You choose paper...");  // Delete after
        } else if (choice.equals("2")) {
            // answer set to scissors
            this.answer = "Scissors";
            System.out.println("You choose scissors...");  // Delete after
        } else {
            // 1, 2, or 3 not inputted, re-asking user.
            System.out.println("Answer not recognised. Please  enter a value 1, 2, or 3.");
            setAnswer();
        }
    }

    public String getAnswer() {
        return answer;
    }

}
