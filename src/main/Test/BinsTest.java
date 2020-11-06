import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void setBin() {
        Bins testBin = new Bins();
        testBin.setBin(4);
        testBin.setBin(4);
        testBin.setBin(4);
        int expected = 3;
        int actual = testBin.getBin(4);
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void getBin() {
        Bins testBin = new Bins();
        testBin.setBin(2);
        testBin.setBin(1);
        testBin.setBin(2);
        testBin.setBin(2);
        int expected = 3;
        int actual = testBin.getBin(2);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void incrementBin(){
        Bins testBin = new Bins();
        testBin.incrementBin(8);
        testBin.incrementBin(8);
        testBin.incrementBin(8);
        testBin.incrementBin(8);
        testBin.incrementBin(8);
        int expected = 5;
        int actual = testBin.getBin(8);
        Assertions.assertEquals(expected,actual);
    }
}