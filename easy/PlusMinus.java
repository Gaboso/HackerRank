package easy;

import java.util.List;

class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int zero = 0;
        int positive = 0;
        int negative = 0;

        int size = arr.size();

        for (int current : arr) {
            if (current == 0) {
                zero++;
            } else if (current < 0) {
                negative++;
            } else {
                positive++;
            }
        }

        String sixPlaceFormat = "%.6f %n";
        System.out.printf(sixPlaceFormat, (double) positive / size);
        System.out.printf(sixPlaceFormat, (double) negative / size);
        System.out.printf(sixPlaceFormat, (double) zero / size);
    }

}