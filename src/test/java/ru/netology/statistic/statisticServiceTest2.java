package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class statisticServiceTest2 {
    @Test
    void findMax() {
        statisticService2 service = new statisticService2();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomes);

        assertEquals(expected, actual);
    }
}
