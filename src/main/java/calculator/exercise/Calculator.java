package calculator.exercise;

public class Calculator {

    public float add(float n1, float n2) {
        return n1 + n2;
    }

    public float subtract(float n1, float n2) {
        return n1 - n2;
    }

    public float multiply(float n1, float n2) {

        return n1 * n2;
    }

    public float divide(float n1, float n2) throws ArithmeticException{
        if (n2 == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        return n1 / n2;
    }

}
