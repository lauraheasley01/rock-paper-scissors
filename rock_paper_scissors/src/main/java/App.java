public class App {

    public static void main(String[] args) throws InterruptedException {

        User user = new User();
        Game newGame = new Game();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        Thread.sleep(2000);
        System.out.println("---------- Rules: ----------");
        System.out.println("rock beats scissors,");
        System.out.println("scissors beats paper,");
        System.out.println("paper beats rock");
        System.out.println("0 = Rock");
        System.out.println("1 = Paper");
        System.out.println("2 = Scissors");

        Thread.sleep(2000);

        user.userStart();
        user.setAnswer();
        newGame.startGame(user);

    }

}
