package task6_Lambdas_Level1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListProvider provide = new ListProvider();
        var wordsAndNumbers = provide.getItems();

        ListSorterAndFilter sortedWordsAndNumbers = new ListSorterAndFilter();
        var wordsAndNumbersSorted = sortedWordsAndNumbers.orderLowestToHighestLetters(wordsAndNumbers);

        ListPrinter printer = new ListPrinter();
        printer.print(wordsAndNumbersSorted);
    }
}
