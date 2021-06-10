import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LampTest {

    @Test
    void defaultLampIsTurnedOff() {
        // given
        Lamp lamp = new Lamp();
        // then
        assertFalse(lamp.getState(), "Lamp should be turned off by default");
    }

    @Test
    void turnOnTest() {
        // given
        Lamp lamp = new Lamp();
        // when
        lamp.turnOn();
        // then
        assertTrue(lamp.getState(), "Lamp should be turned on");
    }

    @Test
    void turnOffTest() {
        // given
        Lamp lamp = new Lamp();
        // when
        lamp.turnOff();
        // then
        assertFalse(lamp.getState(), "Lamp should be turned off");
    }

    @Test
    void switchLampState() {
        // given
        Lamp lamp = new Lamp();
        // when
        lamp.turnOn();
        lamp.turnOff();
        // then
        assertFalse(lamp.getState(), "Lamp should be turned off");
    }
}