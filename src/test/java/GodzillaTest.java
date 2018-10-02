import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GodzillaTest {

    Godzilla godzilla;

    @Before
    public void setUp() throws Exception {
        godzilla = new Godzilla("Godzilla", 30, 50);
    }

    @Test
    public void hasName() {
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(30, godzilla.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
    assertEquals(50, godzilla.getAttackValue());
    }

    @Test
    public void canRoad() {
    assertEquals("ROAAARRR", godzilla.roar());
    }

    @Test
    public void canReduceVehicleHealth() {
       Tank tank = new Tank(70, "green", 15);
        godzilla.attack(tank);
       assertEquals(20, tank.getHealthValue());
    }

    @Test
    public void canMove() {
        assertEquals("Godzilla moved", godzilla.move());

    }
}
