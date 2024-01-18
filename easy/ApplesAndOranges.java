package easy;

import java.util.List;

public class ApplesAndOranges {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s - start of the house
     *  2. INTEGER t - end of the house
     *  3. INTEGER a - apple tree
     *  4. INTEGER b - orange tree
     *  5. INTEGER_ARRAY - apples
     *  6. INTEGER_ARRAY - oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int countApple = 0;
        int countOrange = 0;

        for (int apple : apples) {
            int dist = a + apple;
            if (dist >= s && dist <= t) {
                countApple++;
            }
        }

        for (int orange : oranges) {
            int dist = b + orange;
            if (dist >= s && dist <= t) {
                countOrange++;
            }
        }

        System.out.println(countApple);
        System.out.println(countOrange);
    }

}