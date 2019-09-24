package task5.service.impl;

import org.junit.Before;
import org.junit.Test;
import task5.service.SwitchBitService;

import static org.junit.Assert.*;

public class SwitchBitServiceImplTest {

    SwitchBitService service;

    @Before
    public void setUp() {
        service = new SwitchBitServiceImpl();
    }

    @Test
    public void switchByteDefinedTest() {

        assertEquals(11, service.switchByteDefined(10, 0, false));

    }

    @Test
    public void switchByteTest() {

        assertEquals(19, service.switchByte(17, 1));
    }
}