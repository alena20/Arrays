package edu.epam.jaggetarray.service;

import java.util.Comparator;

public class SumComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] array1, int[] array2) {
        return SumService.arraySum(array1) - SumService.arraySum(array2);
    }

}
