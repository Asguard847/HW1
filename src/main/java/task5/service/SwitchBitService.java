package task5.service;

/**
 * Class contains methods for switching
 * byte(0 to 1 and vice versa) in an integer
 * number at the particular position
 */

public interface SwitchBitService {

    /**
     * @param number    - number to be processed.
     * @param pos       - position of a bit to be switched from the right.Starts with 0.
     * @param byteIsSet - true if a bit in the required position is 1,
     *                  false if 0.
     * @return - resulting integer.
     * @deprecated Added just for the task requirements
     * Better use {@link #switchByte(int, int)} instead.
     * <p>
     * <p>
     * Method for switching byte in an integer number.
     * Here we need to know if the byte to be switched
     * is set or not.
     */

    @Deprecated
    public int switchByteDefined(int number, int pos, boolean byteIsSet);


    /**
     * Method for switching byte at the particular position
     * in an integer number (0 to 1 and vice versa).
     * Here we don't need to know current value of the byte,
     * as we need to in deprecated {@link #switchByteDefined(int, int, boolean)}
     *
     * @param number - number to be processed.
     * @param pos    - position of a bit to be switched from the right
     * @return - resulting integer.
     */

    public int switchByte(int number, int pos);
}

