package task3;

import task3.service.BitCountService;
import task3.service.InputService;

public class BitCount {

    private InputService inputService;
    private BitCountService bitCountService;

    public int run() {

        System.out.println("Enter your number");
        String inputString = inputService.getInput();
        int numberOfBits = 0;
        try {
            long input = Long.parseLong(inputString);
            numberOfBits = bitCountService.countBits(input);
            System.out.println("Number of bits: " + numberOfBits);

        } catch (NumberFormatException e) {
            throw new RuntimeException("Wrong input");
        }
        return numberOfBits;
    }

    public void setInputService(InputService inputService) {
        this.inputService = inputService;
    }

    public void setBitCountService(BitCountService bitCountService) {
        this.bitCountService = bitCountService;
    }
}
