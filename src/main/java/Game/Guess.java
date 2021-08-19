package Game;

public class Guess {
    Player p1;
    Player p2;
    Player p3;

    public void starttGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        boolean p1Win = false;
        boolean p2Win = false;
        boolean p3Win = false;

        int guessNumber = (int) (Math.random() * 10);
        System.out.println("Guessable number is between 0 to 9");

        while (true) {
            System.out.println("The win number is: "+ guessNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            System.out.println("Player 1 type number: "+ p1.number);
            System.out.println("Player 2 type number: "+ p2.number);
            System.out.println("Player 3 type number: "+ p3.number);

            if (p1.number == guessNumber){
                p1Win =true;
                System.out.println("The winner is: player 1");
            }
            if (p2.number == guessNumber){
                p2Win =true;
                System.out.println("The winner is: player 2");
            }
            if (p3.number == guessNumber){
                p3Win =true;
                System.out.println("The winner is: player 3");
            }
            if (p1Win || p2Win || p3Win)  {
                System.out.println("End game");
                break;
            }
            else {
                System.out.println("Nobody win");
            }
        }
    }
}
