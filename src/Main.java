import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 18;
        int max = 40;
        int diff = max - min;
        int summ = 0;
        int summ1 = 0;
        int[] LazyArray = new int[25];
        Random random = new Random();
        for (int i = 0; i < LazyArray.length; i++) {
            LazyArray[i] = random.nextInt(diff + 1) + min;
            summ += LazyArray[i];
        }
        for (int i = 0; i < LazyArray.length; i++) {

          System.out.print(LazyArray[i] + " ");
        }
        System.out.print("First Team");{
            System.out.println("");
        }
        {
            System.out.print("First Team Average Age =" +  " " +(double) summ / LazyArray.length);

System.out.println(" ");
        }
        for (int t = 0; t < LazyArray.length; t++) {
            LazyArray[t] = random.nextInt(diff + 1) + min;
            summ1 += LazyArray[t];
        }
        for (int t = 0; t < LazyArray.length; t++) {

            System.out.print(LazyArray[t] + " ");
        }
        System.out.print("Second Team");
        System.out.println("");
        {
            System.out.print("Second Team Average Age =" +  " " +(double) summ1 / LazyArray.length);
        }
    }
}




