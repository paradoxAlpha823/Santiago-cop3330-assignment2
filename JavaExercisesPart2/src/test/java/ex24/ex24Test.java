package ex24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class ex24Test
{
    /**
     * Rigorous Test :-)
     */

    ex24 tester;

    @BeforeEach
    void setUp()
    {
        tester = new ex24();
    }

    @Test
    @DisplayName("Test anagrams ")
    public void anagramtest()
    {
        assertTrue(tester.isAnagram("note","tone"));
        assertFalse(tester.isAnagram("note","existentialism"));
    }

}
