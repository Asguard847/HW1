package task5.service;

/**
 * Class contains method for determining if
 * a bit is set(equals to 1) at the
 * particular position in a positive integer number.
 */

public interface CheckIfBitIsSetService {

    /**
     * Method for determining if a bit is set(equals to 1)
     * at the particular position in an integer. Used for
     * deprecated {@link task5.service.SwitchBitService#switchByteDefined(int, int, boolean)}
     *
     * @param number - number to be processed.
     * @param pos    - position of a bit from the right.Starts with 0.
     * @return - true if a bit at the required position equals 1, false if 0.
     */

    boolean checkIfBitIsSet(int number, int pos);
}
