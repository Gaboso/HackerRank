package medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;

public class SparseArrays {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String str : stringList) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        return queries.stream()
            .map(query -> frequencyMap.getOrDefault(query, 0))
            .collect(toList());
    }

}
