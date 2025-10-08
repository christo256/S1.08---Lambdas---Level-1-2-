package task1_Lambdas_Level2;

import java.util.List;

public class NamesPrinter {

    public void print(List<String> names) {
        System.out.println("Names containing capital A and 3 letters: ");

        names.forEach(System.out::println);
    }
}
