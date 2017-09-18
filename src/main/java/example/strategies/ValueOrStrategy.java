package example.strategies;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by ilya on 18.09.17.
 */
@JsonSerialize
@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class ValueOrStrategy<T> {
    @Autowired
    @Qualifier("car")
    public T value;
    public Strategy<T> strategy;

    @JsonIgnore
    public T getNextValue() {
        if (strategy == null) {
            return value;
        } else {
            if (strategy.hasNext()) {
                return strategy.getNext();
            } else {
                return null;
            }
        }
    }
}