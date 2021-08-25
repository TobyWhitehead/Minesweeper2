import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TileTest {

    @Test
    @DisplayName("setNumber test")
    void setNumber() {
        Tile tile = new Tile();
        tile.setNumber(2);
        assertEquals(2, tile.getNumber(), "get number test failure");

    }
}