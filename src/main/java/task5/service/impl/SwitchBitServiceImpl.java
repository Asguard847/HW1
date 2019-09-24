package task5.service.impl;

import task5.service.SwitchBitService;

public class SwitchBitServiceImpl implements SwitchBitService {

    @Override
    public int switchByteDefined(int number, int pos, boolean byteIsSet) {
        int result;
        if (byteIsSet) {
            result = number & ~(1 << pos);
        } else {
            result = number | (1 << pos);
        }

        return result;
    }

    @Override
    public int switchByte(int number, int pos) {
        return number ^ (1 << pos);
    }
}
