package task1_Lambdas_Level2;

public class Main {
    public static void main(String[] args) {

        NamesProvider namesProvider = new NamesProvider();
        var names = namesProvider.getNames();

        NamesFilter namesFilter = new NamesFilter();
        var filterNames = namesFilter.filterNames(names);

        NamesPrinter printer = new NamesPrinter();
        printer.print(filterNames);
    }
}
