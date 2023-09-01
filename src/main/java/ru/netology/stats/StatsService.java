package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        long x = 0;
        for (int i = 0; i < sales.length; i++) {
            x = x + sales[i];
            }

        return (int)x;
    }

    public int avgSales(long[] sales) {
        long x = 0;
        for (int i = 0; i < sales.length; i++) {
            x = x + sales[i];
        }

        return ((int)x/sales.length);
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
        long x = 0;
        for (int i = 0; i < sales.length; i++) {
            x = x + sales[i];
        }
        x = x/sales.length;
        int lessAvgMonts = 0;
        for (int i = 0; i < sales.length; i++)
            if (sales[i] < x) {
                lessAvgMonts++;
            }

        return lessAvgMonts;
    }

    public int moreAvgSales(long[] sales) {
        long x = 0;
        for (int i = 0; i < sales.length; i++) {
            x = x + sales[i];
        }
        x = x/sales.length;
        int moreAvgMonts = 0;
        for (int i = 0; i < sales.length; i++)
            if (sales[i] > x) {
                moreAvgMonts++;
            }

        return moreAvgMonts;
    }

}
