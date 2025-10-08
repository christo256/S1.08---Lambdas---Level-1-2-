package task3_Lambdas_Level2;

public class Main {
    public static void main(String[] args) {

        var provider = new MathOperationsProvider();

        System.out.println("5 + 5 = " + provider.addition().operation(5, 5));
        System.out.println("7 - 3 = " + provider.substraction().operation(7, 3));
        System.out.println("7 x 5 = " + provider.multiplication().operation(7, 5));
        System.out.println("10 / 2 = " + provider.division().operation(10, 2));
    }
}
