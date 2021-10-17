package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        int count = 1;
        int number1 = 0;
        int number2 = 0;
        for (Integer i : firstNumber) {
            number1 += i * count;
            count *= 10;
        }
        count = 1;
        for (Integer i : secondNumber) {
            number2 += i * count;
            count *= 10;
        }

        return number1 + number2;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i));
            i++;
        }
        return newList;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        List<T> newList = new ArrayList<>();
        if (list.size() != 0) {
            newList.add(list.get(0));
            if (list.size() > 1) {
                newList.add(list.get(list.size() - 1));
            }
        }
        return newList;
    }
}
