public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator");
            System.out.println("Operators: +, -, *, /");
            return;
        }

        double num1;
        double num2;
        String operator = args[1];

        try {
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please provide valid numbers.");
            return;
        }

        double result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operator. ");
                break;
        }
    }

}

