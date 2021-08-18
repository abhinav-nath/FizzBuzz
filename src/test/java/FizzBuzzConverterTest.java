import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzConverterTest {

    private FizzBuzzConverter fizzBuzzConverter;

    @BeforeEach
    void setup() {
        fizzBuzzConverter = new FizzBuzzConverter();
    }

    @Test
    void normalNumbersAreNotConverted() {
        assertEquals("1", fizzBuzzConverter.convert(1));
        assertEquals("2", fizzBuzzConverter.convert(2));
    }

    @Test
    void threeShouldBeConvertedToFizz() {
        assertEquals("Fizz", fizzBuzzConverter.convert(3));
    }

    @Test
    void fiveShouldBeConvertedToBuzz() {
        assertEquals("Buzz", fizzBuzzConverter.convert(5));
    }

    @Test
    void multiplesOfThreeShouldBeConvertedToFizz() {
        assertEquals("Fizz", fizzBuzzConverter.convert(9));
        assertEquals("Fizz", fizzBuzzConverter.convert(21));
        assertEquals("Fizz", fizzBuzzConverter.convert(39));
    }

    @Test
    void multiplesOfFiveShouldBeConvertedToBuzz() {
        assertEquals("Buzz", fizzBuzzConverter.convert(25));
        assertEquals("Buzz", fizzBuzzConverter.convert(50));
        assertEquals("Buzz", fizzBuzzConverter.convert(125));
    }

    @Test
    void multiplesOfBothThreeAndFiveShouldGiveFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(15));
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(45));
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(105));
    }

}