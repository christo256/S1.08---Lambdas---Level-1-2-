package task2_Lambdas_Level2;

import java.util.List;

public class NumbersProvider {

    private List<Integer> numbers;

    public NumbersProvider() {
        this.numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
