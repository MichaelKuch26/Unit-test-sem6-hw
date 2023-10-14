package Six.Task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageComparatorTest {
    private AverageComparator averageComparator;

    @BeforeEach
    public void setUp() {

        averageComparator = new AverageComparator();
    }

    @Test
    public void compareListEqualityTest() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(3);
        list1.add(7);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(2);

        String result = AverageComparator.compareList(list1, list2);

        assertEquals("Среднее значение двух списков равно", result);

    }


    @Test
    public void compareListTestDiffAverageOne() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        String result = AverageComparator.compareList(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void compareListTestDiffAverageTwo() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(9);

        String result = AverageComparator.compareList(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }
}