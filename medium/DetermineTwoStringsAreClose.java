package medium;

import java.util.Arrays;

class DetermineTwoStringsAreClose {

    public static final char A = 'a';
    private static final int ALPHABET_SIZE = 26;

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] frequencyOne = new int[ALPHABET_SIZE];
        int[] frequencyTwo = new int[ALPHABET_SIZE];

        for (int i = 0; i < word1.length(); i++) {
            frequencyOne[word1.charAt(i) - A]++;
        }

        for (int i = 0; i < word2.length(); i++) {
            int current = word2.charAt(i) - A;

            if (frequencyOne[current] == 0) {
                return false;
            }

            frequencyTwo[current]++;
        }

        Arrays.sort(frequencyOne);
        Arrays.sort(frequencyTwo);

        for (int i = 0; i < ALPHABET_SIZE; i++) {
            if (frequencyOne[i] != frequencyTwo[i]) {
                return false;
            }
        }

        return true;
    }


}