package task8_Lambdas_Level1;

public class Main {
    public static void main(String[] args) {

        Reverse reverser = (input) -> new StringBuilder(input).reverse().toString();

        String original = "Hello World!";
        String reversed = reverser.reverse(original);

        System.out.println("Original:" + original);
        System.out.println("Reversed:" + reversed);
    }
}
