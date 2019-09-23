package task5;

import javafx.util.Pair;
import task5.service.InputService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeBit {

    private InputService inputService;

    public static void main(String[] args) {

            boolean byteIsSet = checkIfByteIsSet(number, pos);

            int result;
            if (byteIsSet) {
                result = number & ~(1 << pos);
            } else {
                result = number | (1 << pos);
            }
            System.out.println("Resulting value is: " + result);


    }

    public int run(){

        Pair<Integer, Integer> userInput = inputService.getInput();
        int number = userInput.getKey();
        int pos = userInput.getValue();
    }

    public boolean checkIfByteIsSet(int number, int pos) {
        int requiredByte = number >> pos & 1;
        return requiredByte == 1 ? true : false;
    }

    //Another convenient method if we just need to switch a bit
    public static int changeBit(int number, int pos) {
        return number ^ (1 << pos);
    }

}
