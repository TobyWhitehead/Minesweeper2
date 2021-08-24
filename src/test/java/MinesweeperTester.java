import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class MinesweeperTester {

    @Test
    @DisplayName("This is our test to find out if the setNumber function works")
    public void testSetNumber() {
        Tile tile = new Tile();
        tile.setNumber(2);
        assertEquals(2, tile.getNumber(), "get number test failure");
    }

}
