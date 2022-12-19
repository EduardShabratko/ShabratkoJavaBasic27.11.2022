import java.util.Arrays;
import java.util.Random;

public class HW10 {
    public static void main(String[] args) {
        int[] lazyArray = new int[7];
        int[] lazyArray2 = new int[7];
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < lazyArray.length; i++) {
            lazyArray[i] = random.nextInt(9);
        }
        for (int i = 0; i < lazyArray2.length; i++) {
            lazyArray2[i] = random.nextInt(9);
        }
        Arrays.sort(lazyArray);
        Arrays.sort(lazyArray2);
        System.out.print("Conceived by the company");
        System.out.println(Arrays.toString(lazyArray));
        System.out.print("The player guessed");
        System.out.println(Arrays.toString(lazyArray2));


        for (int i = 0; i < lazyArray2.length; i++)
            if (lazyArray[i] == lazyArray2[i]) {
                count++;
            }
        System.out.println("number of coincidences " + count);
    }
}