package medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class MaximumConcatenatedStringUniqueCharacters {

    public int maxLength(List<String> arr) {
        int maxCombination = 0;

        arr.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));

        for (int i = 0; i < arr.size(); i++) {
            Set<Character> setChar = new HashSet<>();
            tryToAddWordOnSet(setChar, arr.get(i));
            if (setChar.size() > maxCombination) {
                maxCombination = setChar.size();
            }

            for (int j = 0; j < arr.size(); j++) {
                if (j == i) {
                    continue;
                }

                tryToAddWordOnSet(setChar, arr.get(j));

                if (setChar.size() > maxCombination) {
                    maxCombination = setChar.size();
                }
            }

        }

        return maxCombination;
    }

    private void tryToAddWordOnSet(Set<Character> setChar, String word) {
        Set<Character> letters = new HashSet(word.length());
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (setChar.contains(letter)) {
                return;
            }

            letters.add(letter);
        }

        if (letters.size() == word.length()) {
            setChar.addAll(letters);
        }
    }

}
