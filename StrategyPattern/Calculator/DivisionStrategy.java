public class DivisionStrategy implements OperationStrategy {
    @Override
    public double execute(double firstOperand, double secondOperand) {
        if (secondOperand == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return firstOperand / secondOperand;
    }
}