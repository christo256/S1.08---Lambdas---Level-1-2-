package task2_Lambdas_Level2;

public class Main {
    public static void main(String[] args) {

        var numbersProvider = new NumbersProvider();
        var numbers = numbersProvider.getNumbers();

        var numbersWithLetter = new NumbersWithLetter();
        var numWithLetter = numbersWithLetter.numberEvenOrOdd(numbers);

        var printer = new NumbersPrinter();
        printer.print(numWithLetter);
    }
}
