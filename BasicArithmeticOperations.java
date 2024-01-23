import java.util.Scanner;

public class BasicArithmeticOperations {

    private static Scanner scanner = new Scanner(System.in);
    private static Integer firstNumber;
    private static Integer secondNumber;
    private static Integer option;

    public static void main(String[] args) {
        System.out.println("Welcome to simply calc, here you can perform basic calculations");

        while (true) {
            System.out.print("Please choose any one ");
            System.out.println("1: Sum  2: Subtract 3: Multiply 4: Division 5: Exit");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Sum operation selected ");
                    getNumbersFromUser();
                    int sum = firstNumber + secondNumber;
                    System.out.println("Sum: " + sum);
                    break;
                case 2:
                    System.out.println("Subtract operation selected ");
                    getNumbersFromUser();
                    int difference = firstNumber - secondNumber;
                    System.out.println("Difference: " + difference);
                    break;
                case 3:
                    System.out.println("Multiply operation selected ");
                    getNumbersFromUser();
                    int product = firstNumber * secondNumber;
                    System.out.println("Product: " + product);
                    break;
                case 4:
                    System.out.println("Division operation selected ");
                    getNumbersFromUser();
                    if (secondNumber != 0) {
                        double quotient = (double) firstNumber / secondNumber;
                        System.out.println("Quotient: " + quotient);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the calculator. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }
    }

    public static void getNumbersFromUser() {
        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();
    }
}
