package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class FindPlayersWithZeroOrOneLosses {

    public List<List<Integer>> findWinners(int[][] matches) {

        Map<Integer, Integer> loserMap = new HashMap<>();
        for (int[] match : matches) {
            loserMap.put(match[0], loserMap.getOrDefault(match[0], 0));
            loserMap.put(match[1], loserMap.getOrDefault(match[1], 0) + 1);
        }

        List<Integer> noLoses = new ArrayList<>();
        List<Integer> oneLoses = new ArrayList<>();

        Set<Map.Entry<Integer, Integer>> entries = loserMap.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            Integer loses = entry.getValue();

            if (0 == loses) {
                noLoses.add(entry.getKey());
            } else if (1 == loses) {
                oneLoses.add(entry.getKey());
            }
        }

        Collections.sort(noLoses);
        Collections.sort(oneLoses);

        List<List<Integer>> result = new ArrayList<>(2);
        result.add(noLoses);
        result.add(oneLoses);
        return result;
    }

}