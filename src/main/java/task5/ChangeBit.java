package task5;

import javafx.util.Pair;
import task5.service.CheckIfBitIsSetService;
import task5.service.InputService;
import task5.service.SwitchBitService;

public class ChangeBit {

    private InputService inputService;
    private CheckIfBitIsSetService checkIfBitIsSetService;
    private SwitchBitService switchBitService;

    public ChangeBit(InputService inputService,
                     CheckIfBitIsSetService checkIfBitIsSetService,
                     SwitchBitService switchBitService) {
        this.inputService = inputService;
        this.checkIfBitIsSetService = checkIfBitIsSetService;
        this.switchBitService = switchBitService;
    }

    public int runWithBitDefined() {

        Pair<Integer, Integer> userInput = inputService.getInput();
        int number = userInput.getKey();
        int pos = userInput.getValue();

        boolean byteIsSet = checkIfBitIsSetService.checkIfBitIsSet(number, pos);

        int resultingInt = switchBitService.switchByteDefined(number, pos, byteIsSet);

        return resultingInt;
    }

    public int runWithBitUndefined() {

        Pair<Integer, Integer> userInput = inputService.getInput();
        int number = userInput.getKey();
        int pos = userInput.getValue();

        int resultingInt = switchBitService.switchByte(number, pos);

        return resultingInt;

    }

}
