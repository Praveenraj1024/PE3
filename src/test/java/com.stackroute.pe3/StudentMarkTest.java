package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.InvalidParameterException;

public class StudentMarkTest {
    private StudentMark studentMark;

    @BeforeClass
    private void setUp() {
        //This method runs even before the test cases and initialize
        // the variable with required value.
        this.studentMark = new StudentMark();
    }

    @AfterClass
    private void tearDown() {
        //This method runs after the execution of all remaining methods
        // and reassign the required values.
        this.studentMark = null;
    }

    /*
    To test, the arrayDeclarator() method is throwing NegativeArraySizeException
    if we pass negative value to it.
     */

    @Test(expected = NegativeArraySizeException.class)
    private void givenIntegerShouldReturnNegativeArraySizeException() {
        studentMark.arrayDeclarator(-2);
    }

    /*
    To test, the arrayInitializer() method is returning success message if
    we pass all correct values.
     */
    @Test
    private void givenIntegerAndArrayShouldReturnASuccessMessage() {
        int[] studentGrades = {45, 54};
        String expectedOutput = "Successfully Stored";
        assertTrue(studentMark.arrayDeclarator(2));
        assertEquals(expectedOutput, studentMark.arrayInitializer(studentGrades));
    }

    /*
    To test the arrayDeclarator() method is returning the InvalidParameter Exception
    if we pass a character value.
     */
    @Test(expected = InvalidParameterException.class)
    private void givenCharacterShouldReturnInvalidParameterException() {
        studentMark.arrayDeclarator('4');
    }


    /*
    To test the arrayInitializer() method is returning the InvalidParameter
    Exception.
     */
    @Test(expected = InvalidParameterException.class)
    private void givenIntegerAndArrayShouldReturnInvalidParameterException() {
        assertTrue(studentMark.arrayDeclarator(4));
        String[] studentGrades = {"89", "87", "47", "65"};
        studentGrades.arrayInitializer(studentGrades);
    }

    /*
    To test arrayInitializer() method, whether it is returning an error message
    if we pass a value greater than 100.
     */
    @Test
    private void givenIntegerAndArrayShouldReturnAnErrorMessage() {
        assertTrue(studentMark.arrayDeclarator(2));
        int[] studentGrades = {45, 101};
        String expectedOutput = "Grade should be in between 0 and 100";
        assertEquals(expectedOutput, studentGrades.arrayInitializer(studentGrades));
    }

    /*
    To test arrayInitializer() method, whether it is returning NullPointerException,
    if we pass an array which holds null value.
     */

    @Test(expected = NullPointerException.class)
    private void givenIntegerAndArrayShouldReturnNullPointerException() {
        assertTrue(studentMark.arrayDeclarator(2));
        int[] studentGrades = null;
        studentGrades.arrayInitializer(studentGrades);
    }

}