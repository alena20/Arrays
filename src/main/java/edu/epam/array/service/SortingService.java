package edu.epam.array.service;

import edu.epam.array.entity.ArrayTask;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortingService {
    private static final Logger logger = LogManager.getLogger(SortingService.class);

    public int[] bubbleSortArray(ArrayTask array) {
        int[] bubbleSortedArray = array.getArray();
        for (int i = 0; i < bubbleSortedArray.length - 1; i++) {
            for (int j = 0; j < bubbleSortedArray.length - i - 1; j++) {

                if (bubbleSortedArray[j] > bubbleSortedArray[j + 1]) {

                    int temp = bubbleSortedArray[j];
                    bubbleSortedArray[j] = bubbleSortedArray[j + 1];
                    bubbleSortedArray[j + 1] = temp;
                }
            }
        }
        logger.info("bubble sort - array : {}",bubbleSortedArray);
        return bubbleSortedArray;
    }

    public int[] selectionSortArray(ArrayTask array) {
        int[] selectSortArray = array.getArray();
        for (int i = 0; i < selectSortArray.length; i++) {
            int min = selectSortArray[i];
            int minId = i;
            for (int j = i; j < selectSortArray.length; j++) {
                if (selectSortArray[j] < min) {
                    min = selectSortArray[j];
                    minId = j;
                }
            }
            if (min < selectSortArray[i]) {
                int temp = selectSortArray[i];
                selectSortArray[i] = selectSortArray[minId];
                selectSortArray[minId] = temp;
            }
        }
        logger.info("bubble sort - array : {}",selectSortArray);
        return selectSortArray;
    }

    public int[] insertionSortArray(ArrayTask array) {
        int[] insertSortArray = array.getArray();
        for (int i = 1; i < insertSortArray.length; i++) {
            int current = insertSortArray[i];
            int j = i - 1;

            while (j >= 0 && current < insertSortArray[j]) {
                insertSortArray[j + 1] = insertSortArray[j];
                j = j - 1;
            }
            insertSortArray[j + 1] = current;
        }
        logger.info("bubble sort - array : {}",insertSortArray);
        return insertSortArray;
    }
}
