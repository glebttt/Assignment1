import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class HailstoneTest {
    /*
     * Testing strategy
     * Test inputting a number in the first position of the sequence n = 3
     * Test inputting a number in the 4th position of the sequence n = 4
     * Test inputting a number outside the sequence n = 1
     */

    // n = 3
    @Test
    public void TestThree(){ assertEquals(3+" "+10+" "+5+" "+16+" "+8+" "+4+" "+2+" ", Hailstone.sequence(3));}
    // n = 16
    @Test
    public void TestSixteen(){ assertEquals(16+" "+8+" "+4+" "+2+" ", Hailstone.sequence(16));}
    // n = 1
    @Test
    public void TestOne(){ assertEquals(3+" "+10+" "+5+" "+16+" "+8+" "+4+" "+2+" ", Hailstone.sequence(1));}

}
