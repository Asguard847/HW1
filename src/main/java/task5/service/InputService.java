package task5.service;

import javafx.util.Pair;

/**
 * Class contains method for reading
 * user input from console
 */

public interface InputService {

    /**
     * Method reads user input from console
     *
     * @return   pair of integer values representing user input
     */

    Pair<Integer, Integer> getInput();
}
