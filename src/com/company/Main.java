package com.company;

public class Main
{

    public static void main(String[] args)
{
    int counter = 1;
    int min = 3;
    int max = 10;
    while (counter <= 100)
    {
        printRandomNumber(min, max);
        counter ++;
    }
}

    private static void printRandomNumber(int min, int max)
    {
        java.util.Random random = new java.util.Random();

        int randomRange = random.nextInt(max);
        randomRange = randomRange + 1;

        if (min <= randomRange)
            System.out.println(randomRange);

    }
}
