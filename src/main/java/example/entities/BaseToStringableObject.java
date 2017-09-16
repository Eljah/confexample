package example.entities;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by eljah32 on 9/16/2017.
 */
public class BaseToStringableObject {
    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
