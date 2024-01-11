package easy;

public class StairCase {

    public static final char SPACE = ' ';
    public static final char SYMBOL = '#';

    public static void staircase(int n) {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int spacesLeft = n - i;
            output.setLength(0);
            for (int j = 0; j < spacesLeft; j++) {
                output.append(SPACE);
            }
            for (int k = 0; k < i; k++) {
                output.append(SYMBOL);
            }
            System.out.println(output);
        }
    }

}
