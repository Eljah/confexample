package example.strategies;

import example.entities.CarNumber;

/**
 * Created by ilya on 19.09.17.
 */
public class CarNumberPoorStrategy implements Strategy  {
    @Override
    public CarNumber getNext() {
        return new CarNumber("C178CX","12");
    }

    @Override
    public boolean hasNext() {
        return true;
    }
}
