package com.bridgelabz.logicalprograms;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        int number = 10;
        int firstterm = 0;
        int secondterm = 1;
        System.out.println("Fibonacci Series till " + number + " terms:");

        for (int i = 1; i <= number; ++i)
        {
            System.out.print(firstterm + ", ");
            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
        }
    }
}
