package edu.epam.array.reader;

import edu.epam.array.service.RandomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FillArray {
    private static final Logger logger = LogManager.getLogger(FillArray.class);

    public int countIntegersInFile(String filePath) {
        int size = 0;
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNext()) {
                scanner.next();
                size += 1;
            }
        } catch (FileNotFoundException e) {
             logger.log(Level.ERROR, "File not found");
        }
        return size;
    }

    public int[] getIntegersFromFile(String filePath) {
        int size = countIntegersInFile(filePath);
        int i = 0;
        int[] fileArray = new int[size];
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNext()) {
                fileArray[i] = scanner.nextInt();
                i += 1;
            }
        } catch (FileNotFoundException e) {
             logger.log(Level.ERROR, "File not found");
        }
        return fileArray;
    }

    public int[] filRandom(int size){
        RandomArray rand = new RandomArray();
        int [] randArray = rand.generateRandomNumbers(size);
        return randArray;
    }

}
