import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class SimulationTest {

    @Test
    public void DiceRollTest(){
        Dice a = new Dice();
        int roll = a.tossAndSum(2);
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



}
