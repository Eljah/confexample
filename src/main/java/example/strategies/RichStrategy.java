package example.strategies;

import com.fasterxml.jackson.annotation.JsonIgnore;
import example.entities.Car;
import org.springframework.stereotype.Component;

/**
 * Created by eljah32 on 9/16/2017.
 */

//@Component
public class RichStrategy implements Strategy {
    public int parameter=10;

    @JsonIgnore
    @Override
    public Car getNext() {
        try {
            Thread.sleep(parameter);
            System.out.println("Doing rich strategy");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            return new  Car("C178CX","116");

    }

    @Override
    @JsonIgnore
    public boolean hasNext() {
        return true;
    }
}
