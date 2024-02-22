import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void normalNumbersAreNotConverted() {
        assertEquals("1", fizzBuzz.play(1));
        assertEquals("2", fizzBuzz.play(2));
    }

    @Test
    void threeShouldBeConvertedToFizz() {
        assertEquals("Fizz", fizzBuzz.play(3));
    }

    @Test
    void fiveShouldBeConvertedToBuzz() {
        assertEquals("Buzz", fizzBuzz.play(5));
    }

    @Test
    void multiplesOfThreeShouldBeConvertedToFizz() {
        assertEquals("Fizz", fizzBuzz.play(9));
        assertEquals("Fizz", fizzBuzz.play(21));
        assertEquals("Fizz", fizzBuzz.play(39));
    }

    @Test
    void multiplesOfFiveShouldBeConvertedToBuzz() {
        assertEquals("Buzz", fizzBuzz.play(25));
        assertEquals("Buzz", fizzBuzz.play(50));
        assertEquals("Buzz", fizzBuzz.play(125));
    }

    @Test
    void multiplesOfBothThreeAndFiveShouldGiveFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.play(15));
        assertEquals("FizzBuzz", fizzBuzz.play(45));
        assertEquals("FizzBuzz", fizzBuzz.play(105));
    }

}