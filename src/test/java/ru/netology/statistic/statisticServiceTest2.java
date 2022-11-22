package ru.netology.statistic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class statisticServiceTest2 {
    @Test
    void findMax() {
        statisticService2 service = new statisticService2();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomes);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxIf() {
        statisticService2 service = new statisticService2();

        long[] incomes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        long expected = 11;

        long actual = service.findMax(incomes);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxForOne() {
        statisticService2 service = new statisticService2();

        long[] incomes = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        long expected = 2;

        long actual = service.findMax(incomes);

        assertEquals(expected, actual);
    }

}
