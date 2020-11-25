package edu.epam.array.service;

import edu.epam.array.entity.ArrayTask;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SearchService {
    private static final Logger logger = LogManager.getLogger(SearchService.class);

    public int binarySearch(ArrayTask array,int key, int low ,int high){
        int index = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(array.getElement(mid) < key){
                low = mid + 1;
            } else if (array.getElement(mid) > key) {
                high = mid - 1;
            } else if(array.getElement(mid) == key){
                index = mid;
                break;
            }
        }
        logger.info("binary search - array : {} , value : {} , index in array : {} ",array,key,index);
        return index;
    }

    public int binarySearch(ArrayTask array, int key){
        return binarySearch(array,key,0,array.size()-1);
    }

    public int findMaxNumberInArray(ArrayTask array) {
        int max = 0;
        int[] numbersArray = array.getArray();
        for (Integer element : numbersArray) {
            if (element > max) {
                max = element;
            }
        }
        logger.info("array : {}, max element : {} ",array,max);
        return max;
    }

    public int findMinNumberInArray(ArrayTask array) {
        int min = array.getElement(0);
        int[] numberArray = array.getArray();
        for (Integer element : numberArray) {
            if (element < min) {
                min = element;
            }
        }
        logger.info("array : {}, min element : {} ",array,min);
        return min;
    }
}
