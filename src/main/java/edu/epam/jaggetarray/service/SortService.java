package edu.epam.jaggetarray.service;

import java.util.Comparator;

public class SortService {

    public void sortInAscendingOrder(int[][] array, ChangeRowService swapper, Comparator<int[]> comparator) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (comparator.compare(array[i], array[j]) < 0) {
                    swapper.replaceRow(array, i, j);
                }
            }
        }
    }

    public void sortInDescendingOrder(int[][] array, ChangeRowService swapper, Comparator<int[]> comparator) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (comparator.compare(array[i], array[j]) > 0) {
                    swapper.replaceRow(array, i, j);
                }
            }
        }
    }
}
