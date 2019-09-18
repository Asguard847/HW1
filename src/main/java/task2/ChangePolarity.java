package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangePolarity {
    public static void main(String[] args) {

        System.out.println("Please enter number");
        try (Scanner scanner = new Scanner(System.in)) {
            int input = scanner.nextInt();
            int result = changePolarity(input);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input");
        }
    }

    public static int changePolarity(int input) {
        int result = ~input + 1;
        return result;
    }
}
