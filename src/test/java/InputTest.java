import org.junit.Test;
import static org.junit.Assert.*;

public class InputTest {
    @Test
    public void testIfVersionIsSet(){
        assertEquals(0,Input.version, 0);
    }
}
