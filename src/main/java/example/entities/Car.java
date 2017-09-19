package example.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import example.strategies.Strategy;
import example.strategies.ValueOrStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by eljah32 on 9/16/2017.
 */

@JsonSerialize
@Component
public class Car extends BaseToStringableObject {
    public void setCarNumber(ValueOrStrategy carNumber) {
        if (carNumber != null) {
            if (carNumber.strategy != null) {
                carNumber.value = (CarNumber) carNumber.getNextValue();
                this.carNumber=carNumber;
            }
        }
    }

    @Autowired
    public ValueOrStrategy<CarNumber> carNumber;
    public String carType;

    public Car() {
        this.carType = "SEDAN";
    }

    public Car(String middleNumber, String regionNumber) {
        this.carNumber = new ValueOrStrategy<>();
        this.carNumber.value = new CarNumber(middleNumber, regionNumber);
        this.carType = "SEDAN";
    }


}
