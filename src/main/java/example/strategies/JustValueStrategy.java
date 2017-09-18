package example.strategies;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ilya on 18.09.17.
 */
public class JustValueStrategy<T> implements Strategy {

    public T value;

    @JsonIgnore
    @Override
    public T getNext() {
            System.out.println("Doing just value strategy");
            return value;
    }

    @JsonIgnore
    @Override
    public boolean hasNext() {
        return false;
    }
}
