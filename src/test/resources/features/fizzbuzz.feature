Feature: FizzBuzz game play

  Scenario: Play FizzBuzz to get Fizz
    Given Create a FizzBuzz game
    When I play with number 3
    Then The result is "Fizz"

  Scenario: Play FizzBuzz to get Fizz
    Given Create a FizzBuzz game
    When I play with number 5
    Then The result is "Buzz"

  Scenario: Play FizzBuzz to get Fizz
    Given Create a FizzBuzz game
    When I play with number 15
    Then The result is "FizzBuzz"