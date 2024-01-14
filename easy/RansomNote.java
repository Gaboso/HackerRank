package easy;

import java.util.HashMap;
import java.util.Map;

class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        Map<Character, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char current = magazine.charAt(i);
            int count = magazineMap.getOrDefault(current, 0);
            magazineMap.put(current, count + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char current = ransomNote.charAt(i);
            int count = magazineMap.getOrDefault(current, 0);
            if (count == 0) {
                return false;
            }
            magazineMap.put(current, count - 1);
        }

        return true;
    }

}