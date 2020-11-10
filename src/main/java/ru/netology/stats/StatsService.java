package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public long averageSale(long[] sales) {
        long sum = calculateSum(sales);
        return sum / sales.length; // Среднюю сумму продаж в месяц
    }

    public long bestSalesMonth(long[] sales) {
        long monthlySum = sales[0];
        long monthsNumber = 0;
        long monthsNumberMax = 0;
        for (long sale : sales) {
            monthsNumber += 1;
            if (monthlySum <= sale) {
                monthlySum = sale;
                monthsNumberMax = monthsNumber;
            }
        }
        return monthsNumberMax; // Номер месяца, в котором был пик продаж
    }

    public long worseSalesMonths(long[] sales) {
        long monthlySum = sales[0];
        long monthsNumber = 0;
        long monthsNumberMin = 0;
        for (long sale : sales) {
            monthsNumber += 1;
            if (monthlySum >= sale) {
                monthlySum = sale;
                monthsNumberMin = monthsNumber;
            }
        }
        return monthsNumberMin; // Номер месяца, в котором был минимум продаж
    }

    public long monthsSalesUnderAverage(long[] sales) {
        long averageSale = averageSale(sales);
        long monthlySum;
        long monthsNumber = 0;
        for (long sale : sales) {
            monthlySum = sale;
            if (monthlySum < averageSale) {
                monthsNumber += 1;
            }
        }
        return monthsNumber; // Количество месяцев, в которых продажи были ниже среднего
    }

    public long monthsSalesOverAverage(long[] sales) {
        long averageSale = averageSale(sales);
        long monthlySum;
        long monthsNumber = 0;
        for (long sale : sales) {
            monthlySum = sale;
            if (monthlySum > averageSale) {
                monthsNumber += 1;
            }
        }
        return monthsNumber; // Количество месяцев, в которых продажи были выше среднего
    }
}


