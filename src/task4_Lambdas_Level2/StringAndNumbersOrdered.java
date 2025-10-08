package task4_Lambdas_Level2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringAndNumbersOrdered {

    public List<String> stringAndNumbersOrderedAlphabetically(List<Object> items) {
        return items.stream()
                .filter(item -> item instanceof String)
                .map(item -> (String) item)
                .sorted(Comparator.comparingInt(s -> s.charAt(0)))
                .collect(Collectors.toList());
    }

    public List<String> replaceABY4(List<String> items) {

        return items.stream()
                .map(s -> s.replace('a', '4').replace('A', '4'))
                .collect(Collectors.toList());
    }

    public List<String> sortedByEFirstThenAlphabetical(List<String> items) {

        return items.stream()
                .sorted(Comparator.comparing((String s) -> !s.toLowerCase().contains("e"))
                        .thenComparingInt(s -> s.charAt(0)))
                .collect(Collectors.toList());
    }
}
