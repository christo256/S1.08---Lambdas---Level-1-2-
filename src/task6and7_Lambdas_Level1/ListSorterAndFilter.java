package task6and7_Lambdas_Level1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorterAndFilter {

    public List<String> orderLowestToHighestLetters(List<Object> list) {

        return list.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    public List<String> orderHighestToLowestLetters(List<Object> list) {

        return list.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
    }
}
