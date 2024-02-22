public class FizzBuzz {

    public String play(int num) {

        if (num == 0)
            throw new IllegalArgumentException("Number must be greater than 0");

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