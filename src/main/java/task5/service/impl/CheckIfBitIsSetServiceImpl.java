package task5.service.impl;

import task5.service.CheckIfBitIsSetService;

public class CheckIfBitIsSetServiceImpl implements CheckIfBitIsSetService {

    @Override
    public boolean checkIfBitIsSet(int number, int pos) {
        int requiredByte = number >> pos & 1;
        return requiredByte == 1 ? true : false;
    }
}
