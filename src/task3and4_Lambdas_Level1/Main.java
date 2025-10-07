package task3and4_Lambdas_Level1;

public class Main {
    public static void main(String[] args) {


        var provider = new MonthProvider();
        var months = provider.getMonths();

        var printerLambda = new MonthPrinterLambda();
        printerLambda.print(months);

        //Exercise 4
        var printerMethodRef = new MonthPrinterMethodRef();
        printerMethodRef.print(months);
    }
}