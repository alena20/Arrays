package edu.epam.array.main;

import edu.epam.array.entity.ArrayTask;
import edu.epam.array.reader.FillArray;
import edu.epam.array.service.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static final String filePath = "..\\Arrays\\src\\main\\java\\edu\\epam\\array\\file\\array.txt";
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String [] args){
        ArrayTask array = new ArrayTask();
        FillArray fill = new FillArray();
        array.setArray(fill.filRandom(10));
        logger.log(Level.INFO, "Array random");
        action(array);
        ArrayTask arrayFromFile = new ArrayTask();

        fill.countIntegersInFile(filePath);
        arrayFromFile.setArray(fill.getIntegersFromFile(filePath));
        logger.log(Level.INFO, "Array from file");
        action(arrayFromFile);
    }

    public static void action(ArrayTask array){
        SortingService sortService = new SortingService();
        sortService.bubbleSortArray(array);
        sortService.selectionSortArray(array);
        sortService.insertionSortArray(array);
        SearchService findService = new SearchService();
        int key = array.getElement(3);
        findService.binarySearch(array, key);
        findService.findMinNumberInArray(array);
        findService.findMaxNumberInArray(array);
        NumberService getService = new NumberService();
        getService.primeNumberArray(array);
        getService.fibonacciNumberArray(array);
        getService.nonRepeatedThreeDigitNumbers(array);
    }
}
