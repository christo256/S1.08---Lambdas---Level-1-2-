package task3and4_Lambdas_Level1;

import java.util.List;

public class MonthPrinterMethodRef {

    public void print(List<String> months) {

        months.stream()
                .map(month -> " Month: " + month)
                .forEach(System.out::println);
    }
}
