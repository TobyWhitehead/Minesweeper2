Feature: cucumberTest
  Can I get cucumber to work

  Scenario: run generateGrid with empty grid
    Given empty grid exists
    When I run generateGrid
    Then should output 10