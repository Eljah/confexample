package example;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import example.entities.Car;
import example.entities.CarNumber;
import example.entities.CarTransit;
import example.strategies.CarNumberPoorStrategy;
import example.strategies.PoorStrategy;
import example.strategies.Strategy;
import example.strategies.ValueOrStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;

/**
 * Created by eljah32 on 9/16/2017.
 */

@Component
public class NonStaticSerializationRunner {



    @Autowired
    public CarTransit carTransit;

    public String scenario()
    {
        ObjectMapper mapper = new ObjectMapper();

        //carTransit.car.strategy=new PoorStrategy();

        //carTransit.car.value=new Car("C178CX","16");

        carTransit.car.value=new Car();
        carTransit.car.value.carNumber=new ValueOrStrategy();
        carTransit.car.value.carNumber.strategy=new CarNumberPoorStrategy();

        Car car= (Car)carTransit.car.getNextValue();
        /*
        Car car = null;
        for (Strategy<Car> strategy: carTransit.carStrategy) {
            car = strategy.getNext();
            if (car!=null) {break;}

        }
        */


        //For testing
        //car.carNumber.middleNumber="C178CX";
        //car.carNumber.regionNumber="116";

        //carTransit.carStrategy=car;
        carTransit.date=new Date();
        carTransit.registrator="123456";

        String jsonInString="";

        try {
            //Convert object to JSON string and save into file directly
            //mapper.writeValue(System.out, carTransit);

            //Convert object to JSON string and pretty print
            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(carTransit);
            System.out.println(jsonInString);

            //Convert object to JSON string
            jsonInString = mapper.writeValueAsString(carTransit);
            System.out.println(jsonInString);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        car.carNumber.getNextValue().middleNumber="C177CX";

        return jsonInString;
    }
}
