package task4_Lambdas_Level2;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        var provider = new StringAndNumbersProvider();
        var items = provider.getItems();

        var operations = new StringAndNumbersOrdered();

        List<Integer> onlyNumbers = operations.getNumericStrings(items);
        List<String> replacedAfor4 = operations.replaceAWith4(items);
        List<String> letterEFirst = operations.sortStringsEFirstThenAlphabetically(items);
        List<String> orderedList = operations.stringAndNumbersOrderedAlphabetically(items);

        var printer = new StringToPrinter();

        System.out.println("Only Numbers:");
        printer.print(onlyNumbers);

        System.out.println("\nReplace 'a' with '4':");
        printer.print(replacedAfor4);

        System.out.println("\nLetter 'e' First, then Alphabetical:");
        printer.print(letterEFirst);

        System.out.println("\nOrdered Alphabetically by First Character:");
        printer.print(orderedList);
    }
}
