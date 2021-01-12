import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import defence.Alert;

public class AlertTest {
    @Test
    public void TrueIfAlertIsEnabled() {
        Alert alert = new Alert(false);
        assertTrue(alert.enableAlert());
    }

    @Test
    public void FalseIfAlertIsDisabled() {
        Alert alert = new Alert(true);
        assertFalse(alert.disableAlert());
    }
}
