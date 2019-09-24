package task5;

import task5.service.impl.CheckIfBitIsSetServiceImpl;
import task5.service.impl.InputServiceImpl;
import task5.service.impl.SwitchBitServiceImpl;

public class Main {
    public static void main(String[] args) {
        ChangeBit changeBit = new ChangeBit(new InputServiceImpl(),
                new CheckIfBitIsSetServiceImpl(),
                new SwitchBitServiceImpl());

        System.out.println("Output with defined bit: " + changeBit.runWithBitDefined());
        System.out.println("Output with undefined bit: " + changeBit.runWithBitUndefined());
    }
}
