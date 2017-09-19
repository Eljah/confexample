package example.entities;

import org.springframework.stereotype.Component;

/**
 * Created by eljah32 on 9/16/2017.
 */

@Component
public class Car extends BaseToStringableObject {
    public String middleNumber;
    public String regionNumber;

    public Car()
    {

    }

    public Car(String middleNumber, String regionNumber)
    {
        this.middleNumber=middleNumber;
        this.regionNumber=regionNumber;

    }


}
