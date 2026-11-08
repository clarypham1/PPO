
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        int sum = first + second + third; // sum of 3 numbers
        int product = first * second * third; // product of 3 numbers
        // double average = sum / 3: this one will give a result with the decimal part missing, I looked up and in Java, dividing an int by an int is int division, so adding a decimal 3 -> 3.0 will fix the problem since Java converts it to double too, and we will have the result with the decimals
        double average = sum / 3.0;
        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The product of the numbers is " + product);
        System.out.println("The average of the numbers is " + average);
    }
}