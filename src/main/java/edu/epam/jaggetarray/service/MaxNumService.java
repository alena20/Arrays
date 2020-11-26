package edu.epam.jaggetarray.service;

import edu.epam.jaggetarray.api.ICompare;



public class MaxNumService implements ICompare {

    @Override
    public int compare(int[] firstArray, int[] secondArray) {
        if (getLargestNumber(firstArray) > getLargestNumber(secondArray)) {
            return 1;
        } else{
            return -1;
        }
    }

    public int getLargestNumber(int[] array) {
        int largestNumber = array[0];
        for (Integer number : array) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        return largestNumber;
    }
}
