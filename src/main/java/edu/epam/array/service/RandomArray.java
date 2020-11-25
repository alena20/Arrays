package edu.epam.array.service;

import java.util.Random;

public class RandomArray {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 1000;

    public int[] generateRandomNumbers(int amount) {
        int[] randomNumbers = new int[amount];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = new Random().nextInt(MAX_NUMBER) + MIN_NUMBER;
        }

        return randomNumbers;
    }
}
