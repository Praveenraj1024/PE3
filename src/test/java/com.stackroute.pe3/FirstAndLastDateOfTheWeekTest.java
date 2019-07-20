package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class FirstAndLastDateOfTheWeekTest {
    private FirstAndLastDateOfTheWeek firstAndLastDateOfTheWeek;

    @BeforeClass
    private void setUp() {
        //This method runs even before the test cases and initialize
        // the variable with required value.
        this.firstAndLastDateOfTheWeek = new FirstAndLastDateOfTheWeek();
    }

    @AfterClass
    private void tearDown() {
        //This method runs after the execution of all remaining methods
        // and reassign the required values.
        this.firstAndLastDateOfTheWeek = null;
    }


    /*
    To check the getFirstDate() and getLastDate() method whether it is returning an expected
    result or not if we pass valid inputs.
     */

    @Test
    private void givenDateShouldReturnTheFirstAndLastDateOfThatWeek() {
        int date = 19;
        int month = 07;
        int year = 2019;
        assertTrue(firstAndLastDateOfTheWeek.dateInitializer(date, month, year));
        assertEquals("SUN 14/07/2019", firstAndLastDateOfTheWeek.getFirstDate());
        assertEquals("SAT 20/07/2019", firstAndLastDateOfTheWeek.getLastDate());
    }


    /*
    To test the dateInitializer() method whether it is returning an Invalid
    Parameter Exception or not if we pass input as String.
     */


    @Test(expected = InvalidParameterException.class)
    private void givenDateInStringDataTypeShouldReturnAnInvalidParameterException() {
        int date = 27;
        int month = 07;
        String year = "2019";
        firstAndLastDateOfTheWeek.dateInitializer(date, month, year);
    }

    /*
    To test the dateInitializer() method whether it is returning NullPointer
    Exception or not if we pass null values.
     */


    @Test(expected = NullPointerException.class)
    private void givenDateAsNullShouldReturnNullPointerException() {
        firstAndLastDateOfTheWeek.dateInitializer(null, null, null);
    }

    /*
    To test getFirstDate() and getLastDate() methods whether it is returning the
    unexpected value if pass a valid input.
     */
    @Test
    private void givenDateShouldReturnTheFirstAndLastDateOfThatWeek() {
        int date = 19;
        int month = 07;
        int year = 2019;
        assertTrue(firstAndLastDateOfTheWeek.dateInitializer(date, month, year));
        assertNotEquals("MON 14/07/2019", firstAndLastDateOfTheWeek.getFirstDate());
        assertNotEquals("SUN 20/07/2019", firstAndLastDateOfTheWeek.getLastDate());
    }

}