package task3_Lambdas_Level1;

import java.util.List;

public class MonthProvider {

    private final List<String> months;

    public MonthProvider() {
        this.months = List.of("January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December");
    }

    public List<String> getMonths() {
        return months;
    }
}
