import java.util.*;

public class Main {

    public static void main(String[] args) {
        boolean found = false;
        int[][] coordinates = new int[5][5];
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randCoord1 = (random.nextInt(4) + 1);
            int randCoord2 = (random.nextInt(4) + 1);
            int randCoin = (random.nextInt(100) + 1);
            coordinates[randCoord1][randCoord2] = randCoin;
        }
        while (found == false) {
            System.out.println("enter the first coordinate of your guess");
            int guessCoord1 = sc.nextInt();
            while (guessCoord1 > 4) {
                System.out.println("input too big, try again");
                guessCoord1 = sc.nextInt();
            }
            System.out.println("enter the second coordinate of your guess");
            int guessCoord2 = sc.nextInt();
            while (guessCoord2 > 4) {
                System.out.println("input too big, try again");
                guessCoord2 = sc.nextInt();
            }
                System.out.println("the value of your coordinate guess is " + coordinates[guessCoord1][guessCoord2]);
                int value = coordinates[guessCoord1][guessCoord2];
                if (value > 0) {
                    found = true;
                }
            }


    /*System.out.println(randCoord1);
    System.out.println(randCoord2);
    System.out.println(randCoin);
    System.out.println(coordinates[randCoord1][randCoord2]);*/
        }
    }
