package edu.epam.jaggetarray.main;

import edu.epam.jaggetarray.entity.ArrayTask;
import edu.epam.jaggetarray.report.PrintReport;
import edu.epam.jaggetarray.service.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String [] args) {
        ArrayTask array = new ArrayTask(new int[][]{{4, 2, 3, 3, 7},
                {2, 3, 4, 5},
                {1, 2, 3},
                {1, 2},
                {56}});

        int[][] jarray = array.getJaggedArray();
        ChangeRowService swapper = new ChangeRowService();
        SumService sumService = new SumService();
        MaxNumService largestNumber = new MaxNumService();
        MinNumService smallestNumber = new MinNumService();
        PrintReport report = new PrintReport();
        logger.log(Level.INFO, "JaggedArray:");
        report.printEvenReport(jarray);

        MaxNumberComparator lComparator = new MaxNumberComparator();
        MinNumberComparator sComparator = new MinNumberComparator();
        SumComparator sumComparator = new SumComparator();
        SortService sorter = new SortService();
        logger.log(Level.INFO, "JaggedArray by sum:");
        logger.log(Level.INFO, "ascending order:");
        sorter.sortInAscendingOrder(jarray, swapper, sumComparator);
        report.printEvenReport(jarray);
        logger.log(Level.INFO, "descending order:");
        sorter.sortInDescendingOrder(jarray, swapper, sumComparator);
        report.printEvenReport(jarray);

        logger.log(Level.INFO, "JaggedArray by largest num:");
        logger.log(Level.INFO, "ascending order:");

        sorter.sortInAscendingOrder(jarray, swapper, lComparator);
        report.printEvenReport(jarray);
        logger.log(Level.INFO, "descending order:");
        sorter.sortInDescendingOrder(jarray, swapper, lComparator);
        report.printEvenReport(jarray);

        logger.log(Level.INFO, "JaggedArray by smaller num:");
        logger.log(Level.INFO, "ascending order:");
        sorter.sortInAscendingOrder(jarray, swapper, sComparator);
        report.printEvenReport(jarray);
        logger.log(Level.INFO, "descending order:");
        sorter.sortInDescendingOrder(jarray, swapper, sComparator);
        report.printEvenReport(jarray);
    }
}
