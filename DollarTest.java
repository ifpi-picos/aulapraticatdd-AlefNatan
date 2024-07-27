import static org.junit.Assert.*;
import org.junit.Test;

public class DollarTest {

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
