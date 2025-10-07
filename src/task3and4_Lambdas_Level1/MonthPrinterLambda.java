package task3and4_Lambdas_Level1;

import java.util.List;


public class MonthPrinterLambda {

    public void print(List<String> months) {

        months.stream()
                .map(month -> "Month: " + month)
                .forEach(month -> System.out.println(month));
    }
}
