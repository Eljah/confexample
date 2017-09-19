package example;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import example.entities.CarTransit;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by eljah32 on 9/16/2017.
 */

@Component
public class NonStaticDeserializationRunner {
    public void scenario(String json)
    {
        ObjectMapper mapper = new ObjectMapper();

        try {

            // Convert JSON string from file to Object
            System.out.println(json);
            CarTransit carTransit = mapper.readValue(json, CarTransit.class);
            System.out.println(carTransit.toString());
            System.out.println(carTransit.car.getNextValue());

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
