package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }

        return (int) sumSales;
    }

    public int avgSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }

        return ((int) sumSales / sales.length);
    }

    public int maxSales(long[] sales) {
        int maxSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxSales]) {
                maxSales = i;
            }
        }

        return maxSales + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int lessAvgSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        sumSales = sumSales / sales.length;
        int lessAvgMonts = 0;
        for (int i = 0; i < sales.length; i++)
            if (sales[i] < sumSales) {
                lessAvgMonts++;
            }

        return lessAvgMonts;
    }

    public int moreAvgSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        sumSales = sumSales / sales.length;
        int moreAvgMonts = 0;
        for (int i = 0; i < sales.length; i++)
            if (sales[i] > sumSales) {
                moreAvgMonts++;
            }

        return moreAvgMonts;
    }

}
