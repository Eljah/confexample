package example.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by ilya on 19.09.17.
 */

public class CarNumber  extends BaseToStringableObject {
    public String middleNumber;
    public String regionNumber;

    public CarNumber() {};

    public CarNumber(String middleNumber, String regionNumber)
    {
        this.middleNumber=middleNumber;
        this.regionNumber=regionNumber;

    }
}
