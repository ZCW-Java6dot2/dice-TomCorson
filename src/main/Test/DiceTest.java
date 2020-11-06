import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    public void DiceRollTest(){
        Dice a = new Dice(2);
        int roll = a.getRoll();
        boolean actual;
        boolean expected = true;
        if(roll >12 || roll < 2){
            actual = false;
        }
        else{
            actual = true;
        }
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getRoll() {
    }
}