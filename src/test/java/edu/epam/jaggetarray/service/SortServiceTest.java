package edu.epam.jaggetarray.service;

import edu.epam.jaggetarray.entity.ArrayTask;
import org.apache.logging.log4j.Level;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortServiceTest {
    @Test
    public void isEqualsSumSortAscendingOrder(){
        ArrayTask array = new ArrayTask(new int[][]{{4, 2, 3, 3, 7},
                {2, 3, 4, 5},
                {1, 2, 3},
                {1, 2},
                {56}});
        int[][] expected = new int[][]{{1, 2},
                {1, 2, 3},
                {2, 3, 4, 5},
                {4, 2, 3, 3, 7},
                {56}};
        int[][] jarray = array.getJaggedArray();
        ChangeRowService swapper = new ChangeRowService();
        SumService sumService = new SumService();
        SortService sorter = new SortService();
        sorter.sortInAscendingOrder(jarray, swapper, sumService);
        Assert.assertEquals(jarray,expected);
    }

}