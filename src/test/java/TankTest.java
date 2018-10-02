import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TankTest {

    Tank tank;

    @Before
    public void setUp() throws Exception {
        tank = new Tank(50, "green", 5);
    }

    @Test
    public void hasHealthValue() {
        assertEquals(50, tank.getHealthValue());
    }

    @Test
    public void hasType() {
        assertEquals("green", tank.getType());
    }

    @Test
    public void canAttack() {
        Godzilla godzilla = new Godzilla("godzilla", 100, 100) {
        };
        tank.attack(godzilla);
        assertEquals(95, godzilla.getHealthValue());
    }

    @Test
    public void canSuperAttack() {
    Godzilla godzilla = new Godzilla("godzilla", 100, 100){};
    tank.superAttack(godzilla);
    assertEquals(85, godzilla.getHealthValue());
    }
}


