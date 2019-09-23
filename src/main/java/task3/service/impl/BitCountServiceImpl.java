package task3.service.impl;

import task3.service.BitCountService;

public class BitCountServiceImpl implements BitCountService {

    @Override
    public int countBits(long value) {
        int count = 0;
        while (value > 0) {
            value = value >> 1;
            count++;
        }
        return count;
    }
}
