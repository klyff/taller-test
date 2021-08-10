package com.taller.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrupletsArraysMain {

    //Defines the Size of Quadruplet Array (don't change it)
    private static final int QUADRUP_SIZE = 4;

    //Change the Input array and targetSum for test others results
    private static int[] inputArray = {1, 2, 3, 4, 5, -5, 6, -6};
    private static int targetSum = 5;


    public static void main(String[] args) {
        execute(inputArray, targetSum);
    }

    public static void execute(int[] input, int targetSum){
        List<Integer[]> result = fourNumberSum(input, targetSum);

        StringBuilder buf = new StringBuilder();
        result.stream().forEach(array -> {
            buf.append("[");
            for (int i = 0; i < array.length; i++) {
                buf.append(array[i]);
                if (i < array.length - 1) {
                    buf.append(", ");
                }
            }
            buf.append("]\n");
        });

        System.out.println(buf.toString());
    }

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> output = new ArrayList<>();

        for (int first = 0; first <= array.length - QUADRUP_SIZE; first++) {

            for (int second = first + 1; second <= array.length - (QUADRUP_SIZE - 1); second++) {

                int indexControl = targetSum - (array[first] + array[second]);
                int min = second + 1, max = array.length - 1;

                do {
                    if (array[min] + array[max] < indexControl) {
                        min++;
                    } else if (array[min] + array[max] > indexControl) {
                        max--;
                    } else {
                        Integer[] outArray = {array[max], array[min], array[first], array[second]};
                        output.add(outArray);
                        min++;
                        max--;
                    }
                } while (min < max);
            }
        }

        if (output.isEmpty()) {
            output.add(new Integer[0]);
        }
        return output;
    }


}
