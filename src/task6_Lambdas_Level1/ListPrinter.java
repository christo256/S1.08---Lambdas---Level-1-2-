package task6_Lambdas_Level1;

import java.util.List;

public class ListPrinter {
    public void print(List<Object> list) {

        list.forEach(System.out::println);
    }
}
