package task6and7_Lambdas_Level1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListProvider provide = new ListProvider();
        var words = provide.getItems();

        ListSorterAndFilter sortedWords = new ListSorterAndFilter();
        var wordsSortedShortToLong = sortedWords.orderLowestToHighestLetters(words);

        ListPrinter printer = new ListPrinter();
        System.out.println("Words ordered short to long: ");
        printer.print(wordsSortedShortToLong);

        System.out.println();

        var wordsSortedLongToShort = sortedWords.orderHighestToLowestLetters(words);

        System.out.println("Words ordered long to short: ");
        printer.print(wordsSortedLongToShort);

    }
}
