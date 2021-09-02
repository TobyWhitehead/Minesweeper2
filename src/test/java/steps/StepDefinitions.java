package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;
import com.minesweeper.*;

public class StepDefinitions {
    Tile[][] grid;
    private int actualAnswer;

    @Given("empty grid exists")
    public void empty_grid() {
        grid = new Tile[10][10];
    }

    @When("I run generateGrid")
    public void run_generateGrid() {
        actualAnswer = Minesweeper.generateGrid(grid);
    }

    @Then("should output {int}")
    public void output(int expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}