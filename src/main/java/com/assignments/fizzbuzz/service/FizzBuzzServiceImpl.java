package com.assignments.fizzbuzz.service;

import java.util.stream.IntStream;

public class FizzBuzzServiceImpl implements FizzBuzzService {

    private static final String FIZZ = "FIZZ";
    private static final String BUZZ = "BUZZ";

    @Override
    public void executeFizzBuzzProgram(int rangeFrom, int rangeTo) {
        IntStream.range(rangeFrom, rangeTo).mapToObj(n -> {
            String result = "";
            if (isMultiple(n, 3))
                result += FIZZ;

            if (isMultiple(n,5))
                result += BUZZ;

            return !result.isEmpty() ? result : n;
        }).forEach(System.out::println);
    }

    private boolean isMultiple(int number, int mod) {
        return number % mod == 0
                || String.valueOf(number).contains(String.valueOf(mod));
    }
}
