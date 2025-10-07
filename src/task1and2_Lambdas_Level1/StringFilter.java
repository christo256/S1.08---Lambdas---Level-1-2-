package task1and2_Lambdas_Level1;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {

    public List<String> wordContainsO(List<String> list) {

        return list.stream()
                .filter(str -> str.contains("o"))
                .filter(str -> str.length() > 5)
                .sorted()
                .collect(Collectors.toList());
    }
}
