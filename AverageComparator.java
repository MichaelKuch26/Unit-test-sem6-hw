package Six.Task1;

import java.util.ArrayList;
import java.util.List;

public class  AverageComparator {
    public static String compareList(List<Integer> list1,List<Integer> list2) {


        double average1 = calculateAverage(list1); // Рассчитываем среднее значение первого списка
        double average2 = calculateAverage(list2); // Рассчитываем среднее значение второго списка

        System.out.println("Среднее значение 1-го списка: " + average1);
        System.out.println("Среднее значение 2-го списка: " + average2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Среднее значение двух списков равно";
        }

    }
    public static double calculateAverage(List<Integer> list) {
        int sum = 0;
        for (int num :list) {
            sum += num;
        }
        return (double) sum / list.size();
    }

}
