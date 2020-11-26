package edu.epam.jaggetarray.service;

import java.util.Comparator;

public class MinNumberComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] array1, int[] array2) {
        return MinNumService.getSmallestNumber(array1) - MinNumService.getSmallestNumber(array2);
    }
}
