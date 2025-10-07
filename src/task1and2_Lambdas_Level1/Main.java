package task1and2_Lambdas_Level1;

public class Main {
    public static void main(String[] args) {


        StringProvider provider = new StringProvider();

        var words = provider.getWords();

        StringFilter filter = new StringFilter();
        var filteredWords = filter.wordContainsO(words);

        StringPrinter printer = new StringPrinter();
        printer.print(filteredWords);

    }
}
