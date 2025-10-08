package task4_Lambdas_Level2;

import java.util.List;

public class StringAndNumbersProvider {

    private List<Object> items;

    public StringAndNumbersProvider() {
        this.items = List.of(1, 2, 3, 4, 5, "Water", "Annie", "Kevin", "Alfred", "Caiman");
    }

    public List<Object> getItems() {
        return items;
    }
}
