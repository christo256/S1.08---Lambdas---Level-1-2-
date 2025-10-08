package task2_Lambdas_Level2;

import java.util.List;
import java.util.stream.Collectors;

public class NumbersWithLetter {

    public String numberEvenOrOdd(List<Integer> numbers) {

        return numbers.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(", "));
    }
}
