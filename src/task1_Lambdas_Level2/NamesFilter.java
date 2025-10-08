package task1_Lambdas_Level2;

import java.util.List;
import java.util.stream.Collectors;

public class NamesFilter {

    public List<String> filterNames(List<String> names) {

        return names.stream()
                .filter(nms -> nms.startsWith("A"))
                .filter((nms -> nms.length() == 3))
                .sorted()
                .collect(Collectors.toList());
    }
}
