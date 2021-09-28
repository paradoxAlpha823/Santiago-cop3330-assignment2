package ex27;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class ex27Test
{
    /**
     * Rigorous Test :-)
     */

    ex27 tester;

    @BeforeEach
    void setUp()
    {
        tester = new ex27();
    }

    @Test
    @DisplayName("Test incorrect inputs")
    public void shouldAnswerWithErrors()
    {
        assertEquals("\"The first name must be at least 2 characters long. \\nThe first name must be filled in.\"", 1,tester.firstName("") );
        assertEquals("The first name must be at least 2 characters long.", 0,tester.firstName("J") );
        assertEquals("\"The last name must be at least 2 characters long. \\nThe last name must be filled in.\"", 1,tester.lastName("") );
        assertEquals("The last name must be at least 2 characters long.", 0,tester.lastName("J") );
        assertFalse(tester.zipCode("beep"));
        assertFalse(tester.identification("abc-12345"));
    }

    @Test
    @DisplayName("Test correct inputs")
    public void shouldAnswerWithnoErrors()
    {
        assertEquals("", 2,tester.firstName("Diego") );
        assertEquals("", 2,tester.firstName("Santiago") );
        assertTrue(tester.zipCode("3279"));
        assertTrue(tester.identification("NL-0413"));

    }
}
