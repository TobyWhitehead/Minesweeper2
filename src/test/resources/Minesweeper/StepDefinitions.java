package Minesweeper;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class Stepdefs {
    private Tile[][] grid;
    private int actualAnswer;

    @Given("empty grid exists")
    public void empty_grid() {
        Tile[][] grid = new Tile[10][10];
    }

    @When("I run generateGrid")
    public void run_generateGrid() {
        actualAnswer = Minesweeper.generateGrid(grid);
    }

    @Then("should output {int}")
    public void output(int expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer)
    }
}

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCucumberTest{
}