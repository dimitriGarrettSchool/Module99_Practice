import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        int[] rnd = new int[20];

        Random random = new Random();
        for (int i = 0; i < 20; ++i)
        {
            rnd[i] = random.nextInt(100);

            System.out.printf("" + rnd[i] + "|");
        }

        Arrays.sort(rnd);

        System.out.println("");
        System.out.println("The smallest element was: " + rnd[0]);

        int[] rnd2 = new int[10];

        for (int i = 0; i < 10; ++i)
        {
            rnd2[i] = random.nextInt(1, 100);
        }

        System.out.println("The first value is: " + rnd2[0]);
        System.out.println("The last value is: " + rnd2[9]);

        int a = rnd2[0];
        rnd2[0] = rnd2[9];
        rnd2[9] = a;

        for (int i = 0; i < 10; ++i)
        {
            System.out.printf("" + rnd2[i] + "|");
        }
    }
}