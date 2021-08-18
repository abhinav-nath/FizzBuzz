public class FizzBuzzConverter2 {

    public String convert(int num) {

        String output = "";

        if (isDivisibleBy(num, 3))
            output += "Fizz";

        if (isDivisibleBy(num, 5))
            output += "Buzz";

        if (!isDivisibleBy(num, 3) && !isDivisibleBy(num, 5))
            output = String.valueOf(num);

        return output;
    }

    private boolean isDivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

}