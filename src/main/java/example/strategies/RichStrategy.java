package example.strategies;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

/**
 * Created by eljah32 on 9/16/2017.
 */

@Component
public class RichStrategy implements Strategy {
    @Override
    @JsonIgnore
    public String getName() {
        return "rich";
    }

    public String name="rich";
}
