import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinesweeperTest {

    @Test
    @DisplayName("generateGrid test")
    void generateGrid() {
        Tile[][] grid = new Tile[10][10];
        int numMines = Minesweeper.generateGrid(grid);
        assertEquals(10, numMines, "generateGrid incorrect mine number");
    }

    @Test
    @DisplayName("displayGrid test")
    void displayGrid() {
        Tile[][] grid = new Tile[10][10];
        Minesweeper.generateGrid(grid);
        grid[9][9].setCoverStatus(false);
        String sampleOutput = Minesweeper.displayGrid(grid);
        int length = sampleOutput.length();
        assertTrue(length>1, "displayGrid incorrect output");
    }
}