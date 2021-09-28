package ex37;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertNotEquals;

/**
 * Unit test for simple App.
 *
 */
public class ex37Test {
    ex37 tester;

    @BeforeEach
    void setUp() {
        tester = new ex37();
    }

    @Test
    @DisplayName("Test functions")
    public void tester() {

        assertNotEquals("kek", tester.passwordGen(8,2,2));
    }
}
