package Game;

public class Player {
    int number = 0;

    public void guess(){
        number = (int) (Math.random()*10); // od 0 do 9
    //    System.out.println("My number is: " + number);
    }
}
