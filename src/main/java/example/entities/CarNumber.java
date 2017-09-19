package example.entities;

/**
 * Created by ilya on 19.09.17.
 */

public class CarNumber {
    public String middleNumber;
    public String regionNumber;

    public CarNumber() {};

    public CarNumber(String middleNumber, String regionNumber)
    {
        this.middleNumber=middleNumber;
        this.regionNumber=regionNumber;

    }
}
