package edu.epam.array.service;

import edu.epam.array.entity.ArrayTask;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class NumberService {

    private static final Logger logger = LogManager.getLogger(SortingService.class);

    public List<Integer> primeNumberArray(ArrayTask array) {
        List<Integer> primeList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (isPrime(array.getElement(i))) {
                     primeList.add(array.getElement(i));
                }
        }
        logger.info("prime nums - array : {}",primeList);
        return primeList;
    }

    public boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> fibonacciNumberArray(ArrayTask array) {
        List<Integer> fibonacciList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (isFibonacciNum(array.getElement(i))) {
                fibonacciList.add(array.getElement(i));
            }
        }
        logger.info("fibonacci nums - array : {}",fibonacciList);
        return fibonacciList;
    }

    public boolean isFibonacciNum(int num){
        return perfectSquare(5 * num * num + 4)
                || perfectSquare(5 * num * num - 4);
    }
    public boolean perfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return number == sqrt * sqrt;
    }

    public List<Integer> nonRepeatedThreeDigitNumbers(ArrayTask array) {
        List<Integer> threeDigitList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (isThreeDigit(array.getElement(i))) {
                int first = array.getElement(i) % 10;
                int second = (array.getElement(i) / 10) % 10;
                int third = (array.getElement(i) / 100) % 10;
                if (first != second && second != third && first != third) {
                    threeDigitList.add(array.getElement(i));
                }
            }
        }
        logger.info("three different digits array : {}",threeDigitList);
        return threeDigitList;
    }

    public boolean isThreeDigit(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count = count + 1;
        }
        return count == 3;
    }
}
