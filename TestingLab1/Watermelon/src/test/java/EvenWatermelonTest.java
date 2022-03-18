import static org.junit.Assert.*;
import org.junit.Test;
public class EvenWatermelonTest {
    @Test
    public void divide(){
        EvenWatermelon watermelon = new EvenWatermelon();
        assertEquals("Error: Weight is out of range",watermelon.divide(-10));
    }
}