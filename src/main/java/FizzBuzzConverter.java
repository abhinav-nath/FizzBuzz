public class FizzBuzzConverter {

    public String convert(int num) {

        if (isDivisibleBy(num, 3) && isDivisibleBy(num, 5))
            return "FizzBuzz";

        if (isDivisibleBy(num, 3))
            return "Fizz";

        if (isDivisibleBy(num, 5))
            return "Buzz";

        return String.valueOf(num);
    }

    private boolean isDivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

}