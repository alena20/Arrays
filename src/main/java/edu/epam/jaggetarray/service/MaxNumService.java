package edu.epam.jaggetarray.service;

public class MaxNumService{

    public static int getLargestNumber(int[] array) {
        int largestNumber = array[0];
        for (Integer number : array) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        return largestNumber;
    }
}
