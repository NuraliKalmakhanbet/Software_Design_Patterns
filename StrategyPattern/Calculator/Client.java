public class Client {
    public static void main(String[] args) {
        CalculatorContext calculator = new CalculatorContext(new AdditionStrategy());
        System.out.println("Addition (10 + 5): " + calculator.compute(10.0, 5.0));

        calculator.setOperationStrategy(new SubtractionStrategy());
        System.out.println("Subtraction (10 - 5): " + calculator.compute(10.0, 5.0));

        calculator.setOperationStrategy(new MultiplicationStrategy());
        System.out.println("Multiplication (10 * 5): " + calculator.compute(10.0, 5.0));

        calculator.setOperationStrategy(new DivisionStrategy());
        System.out.println("Division (10 / 5): " + calculator.compute(10.0, 5.0));
    }
}