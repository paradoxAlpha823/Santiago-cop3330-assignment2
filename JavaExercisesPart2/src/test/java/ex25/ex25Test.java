package ex25;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class ex25Test
{
    /**
     * Rigorous Test :-)
     */

    ex25 tester;

    @BeforeEach
    void setUp()
    {
        tester = new ex25();
    }

    @Test
    @DisplayName("Test method ")
    public void testingvalidator()
    {
        assertEquals(0, 0, tester.passwordValidator("1234"));
        assertEquals(1, 1, tester.passwordValidator("abcdef"));
        assertEquals(2, 2, tester.passwordValidator("abc123xyz"));
        assertEquals(3, 3, tester.passwordValidator("1337h@xor!"));
    }
}
