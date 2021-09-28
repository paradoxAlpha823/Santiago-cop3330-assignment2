package ex26;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class ex26Test
{
    /**
     * Rigorous Test :-)
     */

    ex26 tester;
    PaymentCalculator tester2;

    @BeforeEach
    void setUp()
    {
        tester = new ex26();
        tester2 = new PaymentCalculator();
    }

    @Test
    @DisplayName("Test numbers ")
    public void mathtesting()
    {
        assertEquals(70.0, 70.0, tester2.calculateMonthsUntilPaidOff(5000,12,100));
        assertEquals(44.0, 44.0, tester2.calculateMonthsUntilPaidOff(9376.57,6,239.13));
    }

}
