package task3_Lambdas_Level1;

public class Main {
    public static void main(String[] args) {


        var provider = new MonthProvider();
        var months = provider.getMonths();

        var printer = new MonthPrinter();
        printer.print(months);
    }
}