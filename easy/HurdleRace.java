package easy;

import java.util.List;

public class HurdleRace {

    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
        int max = 0;

        for (int current : height) {
            if (current > max) {
                max = current;
            }
        }

        if (k >= max) {
            return 0;
        }

        return max - k;
    }

}
