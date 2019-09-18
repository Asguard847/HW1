package task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeBit {
    public static void main(String[] args) {
        System.out.println("Enter number to be changed, than position of a bit");
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            int pos = sc.nextInt();

            boolean byteIsSet = checkIfByteIsSet(number, pos);

            int result;
            if (byteIsSet) {
                result = number & ~(1 << pos);
            } else {
                result = number | (1 << pos);
            }
            System.out.println("Resulting value is: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
        }
    }

    public static boolean checkIfByteIsSet(int number, int pos) {
        int requiredByte = number >> pos & 1;
        return requiredByte == 1 ? true : false;
    }

    //Another convenient method if we just need to switch a bit
    public static int changeBit(int number, int pos) {
        return number ^ (1 << pos);
    }

}
