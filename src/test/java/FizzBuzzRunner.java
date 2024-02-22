import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzRunner {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void generateFizzBuzzFrom1To200() {
        for (int i = 1; i <= 200; i++) {
            System.out.print(fizzBuzz.play(i) + " ");
        }
    }

}