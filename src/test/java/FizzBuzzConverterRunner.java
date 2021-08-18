import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzConverterRunner {

    FizzBuzzConverter fizzBuzzConverter;

    @BeforeEach
    void setup() {
        fizzBuzzConverter = new FizzBuzzConverter();
    }

    @Test
    void generateFizzBuzzFrom1To200() {
        for (int i = 1; i <= 200; i++) {
            System.out.print(fizzBuzzConverter.convert(i) + " ");
        }
    }

}