package edu.epam.array.entity;

import java.util.Arrays;

public class ArrayTask {
    private int [] array;

    public ArrayTask(int... array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int size() {
        return array.length;
    }

    public int getElement(int index) {
        return array[index];
    }

    public void setElement(int index, int num) {
        this.array[index] = num;
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
        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }
}
