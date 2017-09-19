package example.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.stereotype.Component;

/**
 * Created by eljah32 on 9/16/2017.
 */

@Component
@JsonSerialize
public class Car extends BaseToStringableObject {
    public CarNumber carNumber;
    public String carType;

    public Car()
    {

    }

    public Car(String middleNumber, String regionNumber)
    {
        this.carNumber=new CarNumber(middleNumber,regionNumber);
        this.carType="SEDAN";
    }


}
