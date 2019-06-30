package org.fasttrack.it;


public class App
{
    public static void main( String[] args ){

        SumCalculator.sumCalculator(20, 10);
        SumCalculator.sumCalculator(20.2, 10);
        SumCalculator.sumCalculator(20, 10.7);
        SumCalculator.sumCalculator(20.2, 10.7);

        AverageCalculator.averageCalculator(10, 12);
        AverageCalculator.averageCalculator(10.5, 12);
        AverageCalculator.averageCalculator(10, 12.5);
        AverageCalculator.averageCalculator(10.5, 12.5);

        DivisionCalculator.divisionCalculator(24,12);
        DivisionCalculator.divisionCalculator(24.2,12);
        DivisionCalculator.divisionCalculator(24,12.2);
        DivisionCalculator.divisionCalculator(24.2,12.2);

    }
}
