package edu.epam.jaggetarray.service;

import edu.epam.jaggetarray.api.ICompare;

public class MinNumService implements ICompare {

    @Override
    public int compare(int[] firstArray, int[] secondArray) {
        if (getSmallestNumber(firstArray) > getSmallestNumber(secondArray)) {
            return 1;
        } else{
            return -1;
        }
    }

    public int getSmallestNumber(int[] array) {
        int smallestNumber = array[0];

        for (Integer number : array) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        return smallestNumber;
    }
}
