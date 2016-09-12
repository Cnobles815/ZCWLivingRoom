package nobles.christopher.ZCWLivingRoom;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by christophernobles on 9/9/16.
 */

public class TelevisionTEST {

    @Test
    public void setVolumeTest() {
        Television television = new Television();

        Integer expectedValue = 0 ;
        Integer actualValue = television.getVolume();
        assertEquals("The value should be 0" , expectedValue, actualValue);


    }

    @Test
    public void getVolumeTEst() {
        Television television = new Television();

        Integer expectedValue = television.setVolume(5);
        Integer actualValue = 5;
        assertEquals("The value should be 5" , expectedValue , actualValue)

    }

}






