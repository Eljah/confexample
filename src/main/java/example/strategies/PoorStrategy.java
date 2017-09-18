package example.strategies;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

/**
 * Created by eljah32 on 9/16/2017.
 */

//@Component
public class PoorStrategy<T> implements Strategy {
    Class<T> clazz;

    @JsonIgnore
    @Override
    public T getNext() {
        try {
            Thread.sleep(1000);
            System.out.println("Doing rich strategy");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return newInstance(clazz);
    }

    @JsonIgnore
    @Override
    public boolean hasNext() {
        return true;
    }

    public String name="poor";

    public <T> T newInstance(Class<T> cls) {
        T myObject = null;
        try {
            myObject = cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
