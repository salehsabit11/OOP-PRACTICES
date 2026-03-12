import java.util.Scanner;

class Calculator {
    int a, b;
    char operator;

    // Constructor
    Calculator(int a, int b, char operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    void calculate() {
        switch(operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero");
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}

public class page30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scan.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = scan.next().charAt(0);

        // Create Calculator object
        Calculator calc = new Calculator(num1, num2, op);
        calc.calculate();
    }
}
