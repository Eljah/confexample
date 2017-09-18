package example.strategies;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

/**
 * Created by eljah32 on 9/16/2017.
 */

//@Component
public class RichStrategy<T> implements Strategy {
    public String name="rich";
    Class<T> clazz;

    @JsonIgnore
    @Override
    public T getNext() {
        try {
            Thread.sleep(10);
            System.out.println("Doing rich strategy");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    @JsonIgnore
    public boolean hasNext() {
        return true;
    }
}
