package edu.epam.jaggetarray.service;

public class ChangeRowService {

    public void replaceRow(int[][] array, int currentRow, int nextRow) {
        int[] jaggedArray;
        jaggedArray = array[nextRow];
        array[nextRow] = array[currentRow];
        array[currentRow] = jaggedArray;
    }
}
