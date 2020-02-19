package com.assignments.fizzbuzz;

import com.assignments.fizzbuzz.service.FizzBuzzService;
import com.assignments.fizzbuzz.service.FizzBuzzServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FizzBuzzServiceTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private FizzBuzzService fizzBuzzService;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        fizzBuzzService = new FizzBuzzServiceImpl();
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }


    @Test
    public void testExecuteFizzBuzzProgramForRange_1_To_10() throws Exception {
        fizzBuzzService.executeFizzBuzzProgram(1, 11);

        Assertions.assertEquals("1\n2\nFIZZ\n4\nBUZZ\nFIZZ\n7\n8\nFIZZ\nBUZZ\n", outContent.toString());
    }

    @Test
    public void testExecuteFizzBuzzProgramForRange_21_To_30() throws Exception  {
        fizzBuzzService.executeFizzBuzzProgram(21, 31);

        Assertions.assertEquals("FIZZ\n22\nFIZZ\nFIZZ\nBUZZ\n26\nFIZZ\n28\n29\nFIZZBUZZ\n",
                outContent.toString());
    }

    @Test
    public void testExecuteFizzBuzzProgramForRange_31_To_40() throws Exception  {
        fizzBuzzService.executeFizzBuzzProgram(31, 41);

        Assertions.assertEquals("FIZZ\nFIZZ\nFIZZ\nFIZZ\nFIZZBUZZ\nFIZZ\nFIZZ\nFIZZ\nFIZZ\nBUZZ\n",
                outContent.toString());
    }

    @Test
    public void testExecuteFizzBuzzProgramForRange_51_To_60() throws Exception  {
        fizzBuzzService.executeFizzBuzzProgram(51, 61);

        Assertions.assertEquals("FIZZBUZZ\nBUZZ\nFIZZBUZZ\nFIZZBUZZ\nBUZZ\nBUZZ\nFIZZBUZZ\nBUZZ\nBUZZ\nFIZZBUZZ\n",
                outContent.toString());
    }

    @Test
    public void testExecuteFizzBuzzProgramForRange_91_To_100() throws Exception  {
        fizzBuzzService.executeFizzBuzzProgram(91, 101);

        Assertions.assertEquals("91\n92\nFIZZ\n94\nBUZZ\nFIZZ\n97\n98\nFIZZ\nBUZZ\n", outContent.toString());
    }
}
