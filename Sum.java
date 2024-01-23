import java.util.Scanner;

/**
 * Sum
 */
public class Sum {

    public static void main(String[] args) {

        Integer firstNumber ;
        Integer secondNumber ;
        Integer sum;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Sum calc, here you can find sum of two numbers !!!");
        System.out.println("");
        System.out.print("Please enter first number : ");
        
        firstNumber = scanner.nextInt();
        
        System.out.println("");
        System.out.print("Please enter second number : ");

        secondNumber = scanner.nextInt();

        scanner.close();

        sum = firstNumber+secondNumber;

        System.out.println("");
        System.out.println("Answer");
        System.out.println(firstNumber +" + "+ secondNumber +" = "+sum);


    }
}