package task6and7_Lambdas_Level1;

import java.util.List;

public class ListProvider {

    private final List<Object> items;

    public ListProvider() {

        this.items = List.of("House", 2, 235, 5666066, "Helicopter", "Christopher", "Javier", "England", "two");
    }

    public List<Object> getItems() {
        return items;
    }
}
