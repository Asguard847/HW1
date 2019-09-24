package task5;

import javafx.util.Pair;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import task5.service.CheckIfBitIsSetService;
import task5.service.InputService;
import task5.service.impl.CheckIfBitIsSetServiceImpl;
import task5.service.impl.SwitchBitServiceImpl;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class ChangeBitTest {

    @Mock
    InputService inputService;

    @Mock
    CheckIfBitIsSetService checkIfBitIsSetService;

    @Test
    public void runWithBitDefinedTest() {

        Mockito.when(inputService.getInput()).thenReturn(new Pair<Integer, Integer>(12, 0));
        Mockito.when(checkIfBitIsSetService.checkIfBitIsSet(12, 0)).thenReturn(false);

        ChangeBit changeBit = new ChangeBit(inputService,
                                            checkIfBitIsSetService,
                                            new SwitchBitServiceImpl());

        assertEquals(13, changeBit.runWithBitDefined());
    }

    @Test
    public void runWithBitUndefinedTest() {
        Mockito.when(inputService.getInput()).thenReturn(new Pair<Integer, Integer>(9, 1));

        ChangeBit changeBit = new ChangeBit(inputService,
                                            new CheckIfBitIsSetServiceImpl(),
                                            new SwitchBitServiceImpl());
        assertEquals(11, changeBit.runWithBitUndefined());

    }
}