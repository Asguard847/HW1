package task5.service.impl;

import javafx.util.Pair;
import task5.service.InputService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputServiceImpl implements InputService {

    @Override
    public Pair<Integer, Integer> getInput() {

        Pair<Integer, Integer> results = null;

        System.out.println("Enter number to be changed, than position of a bit");

        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            int pos = sc.nextInt();
            results = new Pair<>(number, pos);
        } catch (InputMismatchException e) {
            throw new RuntimeException("Incorrect input");
        }
        return results;
    }
}