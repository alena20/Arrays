package edu.epam.jaggetarray.service;

public class MinNumService {
    public static int getSmallestNumber(int[] array) {
        int smallestNumber = array[0];

        for (Integer number : array) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        return smallestNumber;
    }
}
