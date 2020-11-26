package edu.epam.jaggetarray.service;

import edu.epam.jaggetarray.api.ICompare;

public class SumService implements ICompare {

    @Override
    public int compare(int[] firstArray, int[] secondArray) {
        if (arraySum(firstArray) > arraySum(secondArray)) {
            return 1;
        } else {
            return -1;
        }
    }

    public int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
