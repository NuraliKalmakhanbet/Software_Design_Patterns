public class CalculatorContext {
    private OperationStrategy operationStrategy;

    public CalculatorContext(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public double compute(double firstOperand, double secondOperand) {
        return operationStrategy.execute(firstOperand, secondOperand);
    }
}