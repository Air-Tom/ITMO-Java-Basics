package Task9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LemonElem {
    // Задача 9.3:
    long startTime;
    long endTime;

    public static List<Integer> getBigRandList(int size, String listType, int maxVal) {
        List<Integer> result;

        switch (listType) {
            case "LinkedList": {
                result = new LinkedList<>();
                break;
            }
            case "ArrayList": {
                result = new ArrayList<>();
                break;
            }
            default: {
                System.out.println("Введен некорректный тип списка.");
                return null;
            }
        }

        for (int i = 0; i < size; i++) {
            int randVal = (int) ((Math.random() * (maxVal * 2 + 1)) - maxVal);
            result.add(randVal);
        }

        return result;

    }

    public static Integer getRandItemSomeTimes(List<Integer> list, int numTimes) {
        Integer lastItem = null;

        for (int i = 0; i < numTimes; i++) {
            int randomNum = (int) (Math.random() * list.size());
            lastItem = list.get(randomNum);
        }

        return lastItem;
    }
}
