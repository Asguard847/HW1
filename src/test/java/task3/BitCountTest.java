package task3;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import task3.service.InputService;
import task3.service.impl.BitCountServiceImpl;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BitCountTest {

    BitCount bitCount = new BitCount();

    @Mock
    InputService inputService;

    @Before
    public void setUp() {

        bitCount.setInputService(inputService);
        bitCount.setBitCountService(new BitCountServiceImpl());

    }

    @Test
    public void UserInputProcessingTest() {

        Mockito.when(inputService.getInput()).thenReturn("8");
        int numberOfBits = bitCount.run();
        assertEquals(4, numberOfBits);

    }

    @Test(expected = RuntimeException.class)
    public void IncorrectUserInputTest(){
        Mockito.when(inputService.getInput()).thenReturn("ABC");
        bitCount.run();
    }


}