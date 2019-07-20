package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {
    private ChessBoardPattern chessBoardPattern;


    @BeforeClass
    private void setUp() {
        //This method runs even before the test cases and initialize
        // the variable with required value.
        this.chessBoardPattern = new ChessBoardPattern();
    }

    @AfterClass
    private void tearDown() {
        //This method runs after the execution of all remaining methods
        // and reassign the required values.
        this.chessBoardPattern = null;
    }

    /*
    To test chessBoardGetter() method, whether it is returning the expected
    array or not if we pass positive integer number as size.
     */
    @Test
    private void givenNumberOfRowsAndColumnsShouldReturnAnExpectedArray() {
        int rows = 10;
        int columns = 10;
        assertTrue(chessBoardPattern.arrayDeclarator(rows, columns));
        String[][] expectedResult = {
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}
        };
        assertArrayEquals(expectedResult, chessBoardPattern.chessBoardMaker());
    }

    /*
    To test arrayDeclarator() method, whether it is throwing an InvalidParameter
    Exception or not if we pass a negative value to it.
     */

    @Test(expected = InvalidParameterException.class)
    private void givenNegativeIntegerShouldReturnAnInvalidParameterException() {
        chessBoardPattern.arrayDeclarator(-2, 2);
    }
/*
    To test arrayDeclarator() method, whether it is throwing an InvalidParameter
    Exception or not if we pass a character value to it.
     */

    @Test(expected = InvalidParameterException.class)
    private void givenCharacterShouldReturnAnInvalidParameterException() {
        chessBoardPattern.arrayDeclarator('2', '2');
    }


    /*
    To test chessBoardMaker() method, whether it is returning an empty array
    or not if we pass 0 as number of rows and columns.
     */
    @Test
    private void givenNumberOfRowsAndColumnsIntegersShouldReturnAnEmptyArray() {
        int row = 0;
        int column = 0;
        assertTrue(chessBoardPattern.arrayDeclarator(row, column));
        String[][] expectedResult = {};
        assertArrayEquals(expectedResult, chessBoardPattern.chessBoardMaker());
    }



    /*
    To test chessBoardMaker() method, whether it is returning an null value
    or not if we just call chessBoardMaker() method without assigning the number of
    rows and columns value.
     */

    @Test
    private void givenNumberOfRowsAndColumnsIntegersShouldReturnAnEmptyArray() {
        assertNull(chessBoardPattern.chessBoardMaker());
    }

}