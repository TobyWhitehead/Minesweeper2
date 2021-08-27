<<<<<<< HEAD
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

    @Test
    @DisplayName("setMine test")
    void setMine() {
        Tile tile = new Tile();
        tile.setMine(true);
        assertTrue(tile.getMine(), "getMine test failure");
    }

    @Test
    @DisplayName("setCoverStatus test")
    void setCoverStatus() {
        Tile tile = new Tile();
        tile.setCoverStatus(false);
        assertFalse(tile.getCoverStatus(), "getCoverStatus test failure");
    }
=======
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

    @Test
    @DisplayName("setMine test")
    void setMine() {
        Tile tile = new Tile();
        tile.setMine(true);
        assertTrue(tile.getMine(), "getMine test failure");
    }

    @Test
    @DisplayName("setCoverStatus test")
    void setCoverStatus() {
        Tile tile = new Tile();
        tile.setCoverStatus(false);
        assertFalse(tile.getCoverStatus(), "getCoverStatus test failure");
    }
>>>>>>> 87fda92a131388b9581a7548f2fecfd803926b64
}