package com.company;

import java.util.Arrays;

public class Main extends Array{
    public static void main(String[] args){
        double[] array = generateRandomArray(100000000);
        Arrays.sort(array); // нужно сначала отсортировать

        long time = System.currentTimeMillis(); // текущее время, unix-time
        bruteForce(array, 0.5);
        System.out.println(System.currentTimeMillis() - time);


        time = System.currentTimeMillis();
        binarySearchRecursively(array, 0.5);
        System.out.println(System.currentTimeMillis() - time);
    }
}
