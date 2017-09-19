package example.strategies;

import com.fasterxml.jackson.annotation.JsonIgnore;
import example.entities.Car;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * Created by eljah32 on 9/16/2017.
 */

//@Component
public class PoorStrategy implements Strategy {
    public int parameter=1000;

    @JsonIgnore
    @Override
    public Car getNext() {
        try {
            Thread.sleep(parameter);
            System.out.println("Doing poor strategy");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Car("K480CM","116");
    }

    @JsonIgnore
    @Override
    public boolean hasNext() {
        return true;
    }

}
