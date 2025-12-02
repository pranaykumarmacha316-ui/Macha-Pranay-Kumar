import java.util.Scanner;

public class Problem1 {
    static class Calculator {
        private double a;
        private double b;

        public Calculator(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double add() { return a + b; }
        public double subtract() { return a - b; }
        public double multiply() { return a * b; }
        public double divide() {
            if (b == 0) throw new ArithmeticException("Division by zero is not allowed.");
            return a / b;
        }

        public double compute(String op) {
            if (op == null) throw new IllegalArgumentException("Operation is null");
            op = op.trim().toLowerCase();
            switch (op) {
                case "add":
                case "+":
                case "addition":
                    return add();
                case "subtract":
                case "-":
                case "subtraction":
                    return subtract();
                case "multiply":
                case "*":
                case "multiplication":
                    return multiply();
                case "divide":
                case "/":
                case "division":
                    return divide();
                default:
                    throw new IllegalArgumentException("Unknown operation: " + op);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a (double): ");
            double a = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Enter b (double): ");
            double b = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Enter operation (add, subtract, multiply, divide or + - * /): ");
            String op = sc.nextLine().trim();

            Calculator calc = new Calculator(a, b);
            double result = calc.compute(op);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number input. " + e.getMessage());
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
