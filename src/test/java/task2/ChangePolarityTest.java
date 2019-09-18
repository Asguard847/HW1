package task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChangePolarityTest {

    @Test
    public void changePositivePolarityTest(){
        int input = 21;
        int result = ChangePolarity.changePolarity(input);
        assertEquals(-21, result);
    }

    @Test
    public void changeNegativePolarityTest(){
        int input = -12345;
        int result = ChangePolarity.changePolarity(input);
        assertEquals(12345, result);
    }

}