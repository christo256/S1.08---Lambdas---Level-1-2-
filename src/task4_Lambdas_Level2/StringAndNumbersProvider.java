package task4_Lambdas_Level2;

import java.util.List;

public class StringAndNumbersProvider {

    private List<Object> items;

    public StringAndNumbersProvider() {
        this.items = List.of(2, 4, 5, 4, 5, 1, 8, 99, "Water", "Annie", "Kevin", "Alfred", "Caiman", "Estela", "Europa"
                , "Enchanter");
    }

    public List<Object> getItems() {
        return items;
    }
}
