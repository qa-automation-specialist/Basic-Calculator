package cloudberryday2project;

public class BasicCalculator {

	public static void main(String[] args) {
		 // Step 1: Define two numbers
        double num1 = 12;
        double num2 = 4;

        // Step 2: Define the operation
        char operation = '/'; // can be '+', '-', '*', '/'

        // Step 3: Perform the operation
        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return; // stop program
                }
                break;
            default:
                System.out.println("Invalid operation!");
                return; // stop program
        }

        // Step 4: Display the result
        System.out.println("Result: " + result);
    }
}
