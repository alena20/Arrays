package edu.epam.jaggetarray.service;

import java.util.Comparator;

public class MaxNumberComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] array1, int[] array2) {
        return MaxNumService.getLargestNumber(array1) - MaxNumService.getLargestNumber(array2);
    }
}
