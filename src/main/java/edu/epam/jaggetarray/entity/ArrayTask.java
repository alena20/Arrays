package edu.epam.jaggetarray.entity;

import java.util.Arrays;

public class ArrayTask {
    private int[][] array;

    public ArrayTask(int[][] jaggedArray) {
        this.array = jaggedArray;
    }

    public int[][] getJaggedArray() {
        return array;
    }

    public void setJaggedArray(int[][] jaggedArray) {
        this.array = jaggedArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayTask arrayTask = (ArrayTask) o;
        return Arrays.equals(array, arrayTask.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayTask{");
        sb.append("jaggedArray=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }
}
