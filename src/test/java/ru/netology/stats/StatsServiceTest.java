package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageSale() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.averageSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void bestSalesMonth() {
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.bestSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void worseSalesMonths() {
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.worseSalesMonths(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsSalesUnderAverage() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.monthsSalesUnderAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsSalesOverAverage() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.monthsSalesOverAverage(sales);
        assertEquals(expected, actual);
    }
}
