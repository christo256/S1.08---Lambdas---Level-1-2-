package task3_Lambdas_Level2;

public class MathOperationsProvider {

    public MathOperation addition() {
        return (a, b) -> a + b;
    }

    public MathOperation substraction() {
        return (a, b) -> a - b;
    }

    public MathOperation multiplication() {
        return (a, b) -> a * b;
    }

    public MathOperation division() {
        return (a, b) -> a / b;
    }
}

