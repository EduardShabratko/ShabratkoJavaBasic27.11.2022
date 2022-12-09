import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main3 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Type your number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > randomNumber || n < randomNumber) {
            for (int schetchik = 2; schetchik > 0; --schetchik) {
                if (n > randomNumber) {
                    System.out.println("Your number is higher than expected: " + schetchik);
                    Scanner newscannerT = new Scanner(System.in);
                    int y = newscannerT.nextInt();
                    n = y;
                } else if (n < randomNumber) {
                    System.out.println("Your number is less than expected; " + schetchik);
                    Scanner newscnnaerThr = new Scanner(System.in);
                    int l = newscnnaerThr.nextInt();
                    n = l;
                }
            }
            }
        if (n == randomNumber) {
            System.out.println("You Win!");
        }
        if (n > randomNumber || n < randomNumber) {
            System.out.println("You Lose!");
        }
    }
}
