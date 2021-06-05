package base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
    /*
     *  UCF COP3330 Summer 2021 Assignment 1 Solution
     *  Copyright 2021 Brianne Juntunen
     */
    @Test
    public void notDeepFake() {
        App myApp = new App();
        String author = "Obi-Wan Kenobi";
        String quote = "These aren't the droids you're looking for.";

        String expectedOutput = "Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"";
        String actualOutput = myApp.generateQuote(author, quote);

        assertEquals(expectedOutput, actualOutput);
    }
}
