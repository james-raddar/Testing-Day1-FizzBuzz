package com.karumi.fizzbuzz;

public class Kata {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String fizzBuzz(int num) {
        boolean isMod3 = num % 3 == 0;
        boolean isMod5 = num % 5 == 0;

        if (isMod3 && isMod5) {
            return FIZZ_BUZZ;
        } else if (isMod3) {
            return FIZZ;
        } else if (isMod5) {
            return BUZZ;
        } else {
            return String.valueOf(num);
        }

    }
}
