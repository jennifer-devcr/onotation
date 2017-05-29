package com.exercise.onotation;

import java.util.Arrays;

public class ONotation {
    public static int equilibrium(int[] arr) { // n + n = O(n)
        int arrLength = arr.length;
        int sumLowerIdx = 0;
        int sumHigherIdx = 0;

        /**
         * for (int i = 0; i < arrLength; i++) {
         *   sumHigherIdx += arr[i];
         * }
         */

        sumHigherIdx = Arrays.stream(arr).sum();

        for (int i = 0; i < arrLength; i++) {
            int prevIdx = i - 1;
            sumHigherIdx -= arr[i]; // Leaving the sum of range i+1 ... i+n

            if (prevIdx >= 0) {
                sumLowerIdx += arr[prevIdx];
            }

            if (sumLowerIdx == sumHigherIdx) {
                return i;
            }
        }

        return -1;
    }
}
