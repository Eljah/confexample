package example.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import example.strategies.Strategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by eljah32 on 9/16/2017.
 */

@Component
@JsonSerialize
public class CarTransit extends BaseToStringableObject {
    @Autowired
    public Car car;
    public Date date;
    public String registrator;
    @Autowired
    @Qualifier("poorStrategy")
    public Strategy strategy;
}
