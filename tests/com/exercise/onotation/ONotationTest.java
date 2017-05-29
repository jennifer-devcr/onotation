package com.exercise.onotation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ONotationTest {
    @Test
    void equilibriumNoItems() {
        int expectedResult = -1;


        int[] arr = {};


        assertEquals(expectedResult, ONotation.equilibrium(arr), "Should return not found (-1) for empty Arrays");
    }

    @Test
    void equilibriumBasic() {
        int expectedResult = 1;


        int[] arr = {1, 5, 1};


        assertEquals(expectedResult, ONotation.equilibrium(arr));
    }

    @Test
    void equilibriumFailSortBasic() {
        int expectedResult = -1;


        int[] arr = {1, 5};


        assertEquals(expectedResult, ONotation.equilibrium(arr), "Should return not found (-1) when no equilibrium index is found");
    }

    @Test
    void equilibriumFailBasic() {
        int expectedResult = -1;


        int[] arr = {1, 5, 7, 1};


        assertEquals(expectedResult, ONotation.equilibrium(arr), "Should return not found (-1) when no equilibrium index is found");
    }

    @Test
    void equilibriumLastIdx() {
        int expectedResult = 3;


        int[] arr = {1, 5, -6, 10};


        assertEquals(expectedResult, ONotation.equilibrium(arr));
    }

    @Test
    void equilibriumComplexZero() {
        int expectedResult = 0;


        int[] arr = {-1, 3, -4, 5, 1, -6, 1};


        assertEquals(expectedResult, ONotation.equilibrium(arr));
    }

    @Test
    void equilibriumComplexSample1() {
        int expectedResult = 3;


        int[] arr = {-7, 1, 5, 2, -4, 3, 0};


        assertEquals(expectedResult, ONotation.equilibrium(arr));
    }

    @Test
    void equilibriumComplexSample2() {
        int expectedResult = 4;


        int[] arr = {2, 4, 1, 4, 6, 9, 1, 2, -7, 2, 4};


        assertEquals(expectedResult, ONotation.equilibrium(arr));
    }

    @Test
    void equilibriumFailComplex() {
        int expectedResult = -1;


        int[] arr = {1, 2, 3, 4, 5, 3, 2, 1};


        assertEquals(expectedResult, ONotation.equilibrium(arr), "Should return not found (-1) when no equilibrium index is found");
    }
}