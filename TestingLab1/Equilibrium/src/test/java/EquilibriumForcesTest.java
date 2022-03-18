import static org.junit.Assert.*;
import org.junit.Test;
public class EquilibriumForcesTest {
    @Test
    public void equilibrium(){
        int[][] arr = {{100,-1,2},{-100,2,10},{0,-1,-12}};
        EquilibriumForces nforces = new EquilibriumForces();
        assertEquals("YES",nforces.equilibrium(3,arr));
    }
}