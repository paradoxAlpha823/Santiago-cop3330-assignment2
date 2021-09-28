package ex38;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for simple App.
 *
 */
public class ex38Test
{
    ex38 tester;

    @BeforeEach
    void setUp()
    {
        tester = new ex38();
    }
    @Test
    @DisplayName("Test filter")
    public void tester()
    {
        String[] a1 = new String[]{"1","2","3","4","5","6","7","8"};
        Integer[] even = new Integer[]{2,4,6,8};
        assertArrayEquals(even,tester.filterEvenNumbers(a1));
    }
}
