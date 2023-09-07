package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAvgSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAvg = 15;
        long actualAvg = service.avgSales(sales);

        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    public void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxSalesMonths = 6;
        long actualMaxSalesMonths = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSalesMonths, actualMaxSalesMonths);
    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinSalesMonths = 9;
        long actualMinSalesMonths = service.minSales(sales);

        Assertions.assertEquals(expectedMinSalesMonths, actualMinSalesMonths);
    }

    @Test
    public void shouldFindLessAvgSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedLessAvgSales = 5;
        long actualLessAvgSales = service.lessAvgSales(sales);

        Assertions.assertEquals(expectedLessAvgSales, actualLessAvgSales);
    }

    @Test
    public void shouldFindMoreAvgSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMoreAvgSales = 5;
        long actualMoreAvgSales = service.moreAvgSales(sales);

        Assertions.assertEquals(expectedMoreAvgSales, actualMoreAvgSales);
    }

}
