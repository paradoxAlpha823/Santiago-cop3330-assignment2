package ex34;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 *
 */
public class ex34Test
{
    @Test
    @DisplayName("Test remover")
    public void tester()
    {
        ex34 obj=new ex34();
        ArrayList<String> n=new ArrayList();
        n.add("John Smith");
        n.add("Jackie Jackson");
        n.add("Chris Jones");
        n.add("Amanda Cullen");
        n.add("Jeremy Goodwin");
        boolean r=obj.remover(n,"Amanda Cullen");
        assertEquals(true,r);
    }

    @Test
    @DisplayName("Test remover")
    public void tester2()
    {
        ex34 obj=new ex34();
        ArrayList<String> n=new ArrayList();
        n.add("John Smith");
        n.add("Jackie Jackson");
        n.add("Chris Jones");
        n.add("Amanda Cullen");
        n.add("Jeremy Goodwin");
        boolean r=obj.remover(n,"John Smith");
        assertEquals(true,r);
    }

}
