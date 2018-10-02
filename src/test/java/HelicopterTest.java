import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HelicopterTest {

    Helicopter helicopter;

    @Before
    public void setUp() throws Exception {
        helicopter = new Helicopter(30, "big", 12);
    }

    @Test
    public void hasHealthValue() {
    assertEquals(30, helicopter.getHealthValue());
}

    @Test
    public void hasType() {
        assertEquals("big", helicopter.getType());
    }

    @Test
    public void canAttack() {
        Kaiju godzilla = new Kaiju("godzilla", 20, 10) {
        };
        helicopter.attack(godzilla);
        assertEquals(8, godzilla.getHealthValue());
    }

    @Test
    public void canSuperAttack() {
        Kaiju godzilla = new Kaiju("godzilla", 100, 10) {
        };
        helicopter.superAttack(godzilla);
        assertEquals(64, godzilla.getHealthValue());
    }
}
