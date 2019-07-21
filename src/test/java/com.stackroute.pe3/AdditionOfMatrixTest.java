package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class AdditionOfMatrixTest {
    private AdditionOfMatrix additionOfMatrix

    @BeforeClass
    public void setUp() {
        //This method runs even before the test cases and initialize
        // the variable with required value.
        this.additionOfMatrix = new AdditionOfMatrix();
    }

    @AfterClass
    public void tearDown() {
        //This method runs after the execution of all remaining methods
        // and reassign the required values.
        this.additionOfMatrix = null;
    }



    /*
    To Test addingMatrix() method from AdditionOfMatrix class whether
    it is returning the expected AddedMatrix of the passed Matrices if the passed
    values are with in the range.
     */


    @Test
    public void givenNumberOfRowsAndColumnsAndArraysShouldReturnAnExpectedArray() {
        int rows = 2;
        int columns = 2;
        int[][] firstArray = {{1, 2}, {3, 4}};
        int[][] secondArray = {{1, 2}, {3, 4}};
        assertTrue(additionOfMatrix.arrayDeclarator(rows, columns));
        assertTrue(additionOfMatrix.arrayInitializer(firstArray, secondArray));
        int expectedOutput[][] = {{2, 4}, {6, 8}};
        assertArrayEquals(expectedOutput, additionOfMatrix.addingMatrix());

    }



    /*
    To Test if the size of the array is lesser than the passed array length.
    So, this test case is used to check whether the arrayInitializer() is
    returning the Array Index Out Of Bounds Exception.
     */



    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void givenNumberOfRowsAndColumnsAndArraysShouldReturnArrayIndexOutOfBoundsException() {
        int rows = 2;
        int columns = 1;
        int[][] firstArray = {{1, 2}, {3, 4}};
        int[][] secondArray = {{1, 2}, {3, 4}};
        additionOfMatrix.arrayDeclarator(rows, columns);
        additionOfMatrix.arrayInitializer(firstArray, secondArray);

    }


    /*
    To Test if the number of rows or columns is lesser than zero then
    arrayDeclarator() is should return the Invalid Parameter Exception.
    */


    @Test(expected = InvalidParameterException.class)
    public void givenNumberOfRowsAsNegativeAndColumnsAndArraysShouldReturnArrayIndexOutOfBoundsException() {
        int rows = -2;
        int columns = 2;
        additionOfMatrix.arrayDeclarator(rows, columns);
    }

    /*
    To Test addingMatrix() method from AdditionOfMatrix returns an empty
    array if we pass empty arrays.
     */

    @Test
    public void givenNumberOfRowsAndColumnsAndArraysShouldReturnAnExpectedArray() {
        int rows = 0;
        int columns = 0;
        int[][] firstArray = {};
        int[][] secondArray = {};
        assertTrue(additionOfMatrix.arrayDeclarator(rows, columns));
        assertTrue(additionOfMatrix.arrayInitializer(firstArray, secondArray));
        int expectedOutput[][] = {};
        assertArrayEquals(expectedOutput, additionOfMatrix.addingMatrix());

    }

    /*
    To test addingMatrix() method from AdditionOfMatrix class returns the null
    value if we pass null arrays.
     */

    @Test
    public void givenNumberOfRowsAndColumnsAndArraysShouldReturnNull() {
        int rows = 0;
        int columns = 0;
        int[][] firstArray = null;
        int[][] secondArray = null;
        assertTrue(additionOfMatrix.arrayDeclarator(rows, columns));
        assertTrue(additionOfMatrix.arrayInitializer(firstArray, secondArray));
        assertNull(additionOfMatrix.addingMatrix());

    }

}