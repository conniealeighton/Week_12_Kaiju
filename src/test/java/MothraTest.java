import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MothraTest {

Mothra mothra;

    @Before
    public void setUp() throws Exception {
        mothra = new Mothra("Moth", 70, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Moth", mothra.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(70, mothra.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(10, mothra.getAttackValue());
    }

    @Test
    public void canRoad() {
        assertEquals("ROAAARRR", mothra.roar());
    }

    @Test
    public void canReduceVehicleHealth() {
        Helicopter helicopter = new Helicopter(30, "big", 14);
        mothra.attack(helicopter);
        assertEquals(20, helicopter.getHealthValue());
    }

    @Test
    public void canMove() {
        assertEquals("Moth moved", mothra.move());
    }
}
