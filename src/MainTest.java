import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();
    @Test
    void stampaFull() {
        String result = testing.stampaFull(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("venerdì 1 marzo 2002", result);
    }

    @Test
    void stampaMedium() {
        String result = testing.stampaMedium(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("1 mar 2002", result);
    }

    @Test
    void stampaShort() {
        String result = testing.stampaShort(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("01/03/02", result);
    }
}