package edu.epam.jaggetarray.report;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrintReport {
     private static final Logger logger = LogManager.getLogger(PrintReport.class.getName());

    public void printEvenReport(int[][] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               sb.append(array[i][j] + ", ");
            }
            sb.append("\n");
        }
        logger.log(Level.INFO, sb.toString());
    }
}
