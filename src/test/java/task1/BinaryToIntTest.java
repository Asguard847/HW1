package task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryToIntTest {

    @Test
    public void powerAlgorithmTest() {
        int result = BinaryToInt.power(3, 2);
        assertEquals(9, result);
    }

    @Test
    public void binaryToIntWrongInputTest() {
        String input = "wewrwqe";
        String result = BinaryToInt.binaryToInt(input);
        assertEquals("wrong", result);
    }

    @Test
    public void binaryToIntConversionAlgorithmTest() {
        String input = "100101";
        String result = BinaryToInt.binaryToInt(input);
        assertEquals("37", result);
    }
}