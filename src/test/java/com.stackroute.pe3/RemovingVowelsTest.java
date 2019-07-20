package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class RemovingVowelsTest {

    private RemovingVowels removingVowels;


    @BeforeClass
    private void setUp() {
        //This method runs even before the test cases and initialize
        // the variable with required value.
        this.removingVowels = new RemovingVowels();
    }

    @AfterClass
    private void tearDown() {
        //This method runs after the execution of all remaining methods
        // and reassign the required values.
        this.removingVowels = null;
    }


    /*
    To test vowelsRemover() method returns the expected result if we pass the
    String array which contains places.
     */
    @Test
    private void givenStringArrayShouldReturnTheExpectedArray() {
        String[] arrayOfPlaces = {"India", "New Zealand", "England", "Tamil Nadu"};
        assertTrue(removingVowels.assigner(arrayOfPlaces));
        String[] expectedOutput =  {"nd", "Nw Zlnd", "nglnd", "Tml Nd"};
        assertArrayEquals(expectedOutput, removingVowels.vowelsRemover());
    }

    /*
    To test the assigner() method returns an InvalidParameterException if we
    pass a String value to it.
     */

    @Test(expected = InvalidParameterException.class)
    private void givenStringShouldReturnInvalidParameterException() {
        String places = "India, New Zealand, England";
        removingVowels.assigner(places);

    }

    /*
    To test the vowelsRemover() method whether it is returning null or not,
    if we pass a null array.
     */

    @Test
    private void givenStringNullArrayShouldReturnNull() {
        String[] arrayOfPlaces = null;
        assertTrue(removingVowels.assigner(arrayOfPlaces));
        assertNull(removingVowels.vowelsRemover());
    }

    /*
    To test the vowelsRemover() method, whether it is returning an empty array
    if we pass a String array which contains only vowels value.
     */

    @Test
    private void givenStringArrayShouldReturnTheEmptyArray() {
        String[] arrayOfPlaces = {"aeiou"};
        assertTrue(removingVowels.assigner(arrayOfPlaces));
        String[] expectedOutput =  {};
        assertArrayEquals(expectedOutput, removingVowels.vowelsRemover());
    }

}