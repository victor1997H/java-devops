import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testSaludar() {
        assertEquals(
                "Hola desde Java DevOps",
                App.saludar()
        );
    }
}