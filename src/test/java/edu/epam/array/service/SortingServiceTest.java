package edu.epam.array.service;

import edu.epam.array.entity.ArrayTask;
import junit.framework.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingServiceTest extends TestCase {

    @Test
    public void bubbleSort(){
        int [] customArray = {1,8,5,17,3};
        ArrayTask array = new ArrayTask();
        array.setArray(customArray);
        SortingService service = new SortingService();
        int[] actual = service.bubbleSortArray(array);
        int [] expected = {1,3,5,8,17};
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void selectionSort(){
        int [] customArray = {16,58,15,12,23};
        ArrayTask array = new ArrayTask();
        array.setArray(customArray);
        SortingService service = new SortingService();
        int [] actual = service.selectionSortArray(array);
        int [] expected = {12,15,16,23,58};
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void insertionSort(){
        int [] customArray = {16,58,15,12,23};
        ArrayTask array = new ArrayTask();
        array.setArray(customArray);
        SortingService service = new SortingService();
        int [] actual = service.selectionSortArray(array);
        int [] expected = {12,15,16,23,58};
        Assert.assertEquals(expected,actual);
    }

}