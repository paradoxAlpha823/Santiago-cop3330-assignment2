package ex36;

import ex36.ex36;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 *
 */
public class ex36Test
{
    ex36 tester;

    @BeforeEach
    void setUp()
    {
        tester = new ex36();
    }
    @Test
    @DisplayName("Test functions")
    public void tester()
    {
        ArrayList<Integer> n=new ArrayList();
        n.add(100);
        n.add(200);
        n.add(1000);
        n.add(300);
        assertEquals(400, 400, tester.average(n));
        assertEquals(100, 100, tester.min(n));
        assertEquals(1000, 1000, tester.max(n));
        assertEquals(353.55, 353.55, tester.std(n,400));
    }
}
