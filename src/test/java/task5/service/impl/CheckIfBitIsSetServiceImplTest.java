package task5.service.impl;

import org.junit.Test;
import task5.service.CheckIfBitIsSetService;

import static org.junit.Assert.*;

public class CheckIfBitIsSetServiceImplTest {

    @Test
    public void checkIfBitIsSetTest() {

        CheckIfBitIsSetService service = new CheckIfBitIsSetServiceImpl();
        assertFalse(service.checkIfBitIsSet(9, 1));
    }
}