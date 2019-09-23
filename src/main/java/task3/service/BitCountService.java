package task3.service;

/**
 * Class contains  method for counting
 *  bits in integer primitives
 */

public interface BitCountService {

    /**
     * Method counts number of bits in
     * byte, short, int, long primitives
     *
     *
     * @param value  numeric primitive, which bits need to be counted
     * @return       number of bits in input primitive
     */

    int countBits(long value);
}
