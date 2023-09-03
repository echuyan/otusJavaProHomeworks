package ru.otus.javapro.echuyan.homeworks.hw1.gradle;
import com.google.common.math.LongMath;

import static java.math.RoundingMode.FLOOR;

public class HelloOtus {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        int logFloor = LongMath.log2(4, FLOOR);
        System.out.println(logFloor);

    }
}