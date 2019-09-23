package task3.service.impl;

import task3.service.InputService;

import java.util.Scanner;

public class InputServiceImpl implements InputService {

    @Override
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        scanner.close();
        return result;
    }
}
